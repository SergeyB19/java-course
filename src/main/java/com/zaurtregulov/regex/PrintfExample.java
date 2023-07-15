package com.zaurtregulov.regex;

public class PrintfExample {

    static void employeeInfo(Employee employee) {
        System.out.printf("%03d \t %-12s\t %-12s\t%,.1f \n", employee.id, employee.name, employee.surname,employee.salary*(1+ employee.bonusPct));
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Zaur", "Tregulov", 12345,0.15);
        Employee emp2 = new Employee(15,"Ivan", "Petrov", 6542,0.08);
        Employee emp3 = new Employee(123,"Mariya", "Sidorova", 8542,0.12);

        employeeInfo(emp1);
        employeeInfo(emp2);
        employeeInfo(emp3);


        String newString = String.format("%03d \t %-12s\t %-12s\t%,.1f \n", 1, "Zaur", "Tregulov", 12345 * (1 + 0.15));
        System.out.println(newString);



//        System.out.printf("string нужно выравнять по левому краю" +
//                " а второй параметр - double, надо округлить до десятых"
//                ,"privet","3.1415");

    }
}

class Employee {
    int id;
    String name;
    String surname;
    int salary;
    double bonusPct;

    public Employee(int id, String name, String surname, int salary, double bonusPct) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.bonusPct = bonusPct;
    }
}
