package com.zaurtregulov.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentInfo {
void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
    for (Student s : al) {
        if (pr.test(s)) {
            System.out.println(s);
        }
    }
}

//    void printStudentsOverGrade(ArrayList<Student> al, double grade) {
//        for (Student s : al) {
//            if (s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsUnderAge(ArrayList<Student> al, int age) {
//        for (Student s : al) {
//            if (s.age < age) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsMixCondition(ArrayList<Student> al, int age, double grade, char sex) {
//        for (Student s : al) {
//            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//    }
}
