package com.zaurtregulov.reflection_examples;

import java.lang.reflect.Field;

public class Example3 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee employee = new Employee(10, "Zaur","IT");
        Class employeeClass = employee.getClass();
        Field field = employeeClass.getDeclaredField("salary");
        field.setAccessible(true);
        double salaryValue = (double) field.get(employee);
        System.out.println("salaryValue = " + salaryValue);

        field.set(employee, 1500);
        System.out.println("employee = " + employee);
    }
}
