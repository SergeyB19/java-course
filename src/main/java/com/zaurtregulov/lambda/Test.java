package com.zaurtregulov.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

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
//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return s1.course-s2.course;
//            }
//        });
//        Collections.sort(students,(stud1,stud2) -> stud1.course-stud2.course);
//        System.out.println(students);
////        int p = 3;
//        info.testStudents(students, new CheckOverGrade());
//        System.out.println("---------------------------");
//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student student) {
//                return student.age < 30;
//            }
//        });
//        info.testStudents(students, (Student p) -> {return p.avgGrade > 8;});// 1 вариант
//        info.testStudents(students, p -> p.avgGrade > 8);// 2 вариант
//
//        info.testStudents(students, p -> {
//            System.out.println("hello");
//            return p.avgGrade > 8;
//        }); // 3 вариант

        Predicate<Student> p1 = student -> student.avgGrade > 7.5;
        Predicate<Student> p2 = student -> student.sex == 'm';

        info.testStudents(students,p1);
        System.out.println("separator");
        info.testStudents(students,p2);
        System.out.println("separator");
        info.testStudents(students,p1.and(p2));
        System.out.println("separator");
        info.testStudents(students,p1.or(p2));
        System.out.println("separator");
        info.testStudents(students, p1.negate());




        System.out.println("---------------------------");
        info.testStudents(students, (Student p) -> {
            return p.age < 30;
        });
//        System.out.println("---------------------------");
//        info.testStudents(students, (Student s) -> {
//            return s.age > 20 && s.avgGrade < 9.3 && s.sex == 'f';
//        });
//        info.printStudentsOverGrade(students, 8);
//        System.out.println("---------------------------");
//        info.printStudentsUnderAge(students, 30);
//        System.out.println("---------------------------");
//        info.printStudentsMixCondition(students,20,9.5,'f');
    }
}

