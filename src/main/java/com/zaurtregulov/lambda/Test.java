package com.zaurtregulov.lambda;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Maria", 'f', 23, 3, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        StudentInfo info = new StudentInfo();
//        info.testStudents(students, new CheckOverGrade());
//        System.out.println("---------------------------");
//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student student) {
//                return student.age < 30;
//            }
//        });
        info.testStudents(students, (Student s) -> {
            return s.avgGrade > 8;
        });
        System.out.println("---------------------------");
        info.testStudents(students, (Student s) -> {
            return s.age < 30;
        });
        System.out.println("---------------------------");
        info.testStudents(students, (Student s) -> {
            return s.age > 20 && s.avgGrade < 9.3 && s.sex == 'f';
        });
//        info.printStudentsOverGrade(students, 8);
//        System.out.println("---------------------------");
//        info.printStudentsUnderAge(students, 30);
//        System.out.println("---------------------------");
//        info.printStudentsMixCondition(students,20,9.5,'f');
    }
}

