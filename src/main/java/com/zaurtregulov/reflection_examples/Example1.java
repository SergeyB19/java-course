package com.zaurtregulov.reflection_examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employeeClass = Class.forName("com.zaurtregulov.reflection_examples.Employee");
//        Class employeeClass2 = Employee.class;
//        Employee emp = new Employee();
//        Class employeeClass3 = emp.getClass();

        Field someFild = employeeClass.getField("id");
        System.out.println("Type of id field = " + someFild.getType());
        System.out.println("*****");

        Field[] fields = employeeClass.getFields();
        for (Field field : fields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }
        System.out.println("*****");

        Field[] AllFields = employeeClass.getDeclaredFields();
        for (Field field : AllFields) {
            System.out.println("Type of " + field.getName() + " = " + field.getType());
        }
        System.out.println("--------------------------------------------------------");

        Method someMethod1 = employeeClass.getMethod("increaseSalary");
        System.out.println("Return type of method increaseSalary = " + someMethod1.getReturnType() + ", parameter tyres = " + Arrays.toString(someMethod1.getParameterTypes()));

        System.out.println("--------------------------------------------------------");

        Method someMethod2 = employeeClass.getMethod("setSalary", double.class);
        System.out.println("Return type of method setSalary = " + someMethod2.getReturnType() + ", parameter tyres = " + Arrays.toString(someMethod2.getParameterTypes()));

        System.out.println("--------------------------------------------------------");
        Method[] methods = employeeClass.getMethods();
        for (Method method : methods) {
            System.out.println("Name of method  = " + method.getName() + ", return type = " + method.getReturnType() + ", parameter tyres = " + Arrays.toString(method.getParameterTypes()));

        }

        System.out.println("--------------------------------------------------------");
        Method[] allMethods = employeeClass.getDeclaredMethods();
        for (Method method : allMethods) {
            System.out.println("Name of method  = " + method.getName() + ", return type = " + method.getReturnType() + ", parameter tyres = " + Arrays.toString(method.getParameterTypes()));
        }

        System.out.println("--------------------------------------------------------");
        Method[] allMethods2 = employeeClass.getDeclaredMethods();
        for (Method method : allMethods) {
            if (Modifier.isPublic(method.getModifiers())) {
                System.out.println("Name of method  = " + method.getName() + ", return type = " + method.getReturnType() + ", parameter tyres = " + Arrays.toString(method.getParameterTypes()));
            }
        }
            System.out.println("-----------------Constructor1--------------------");
            Constructor constructor1 = employeeClass.getConstructor();
            System.out.println("Constructor has " + constructor1.getParameterCount() + " parameters, their types are: " + Arrays.toString(constructor1.getParameterTypes()));

        System.out.println("-----------------Constructor2--------------------");
        Constructor constructor2 = employeeClass.getConstructor(int.class, String.class,String.class);
        System.out.println("Constructor has " + constructor2.getParameterCount() + " parameters, their types are: " + Arrays.toString(constructor1.getParameterTypes()));

        System.out.println("-----------------ConstructorAll--------------------");
        Constructor[] constructors = employeeClass.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("Constructor " + constructor.getName() + " has " + constructor.getParameterCount() + " parameters, their types are: " + Arrays.toString(constructor.getParameterTypes()));

        }
    }
}
