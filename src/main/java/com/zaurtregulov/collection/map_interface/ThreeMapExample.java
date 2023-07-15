package com.zaurtregulov.collection.map_interface;

import java.util.Comparator;
import java.util.TreeMap;

public class ThreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 2);
        Student st5 = new Student("Vasiliy", "Smirnov", 1);
        Student st6 = new Student("Sasha", "Kapustin", 3);
        Student st7 = new Student("Elena", "Sidorova", 4);
        treeMap.put(5.8, st1);
        treeMap.put(6.4, st2);
        treeMap.put(7.2, st3);
        treeMap.put(7.5, st4);
        treeMap.put(7.9, st5);
        treeMap.put(8.2, st6);
        treeMap.put(9.1, st7);
        System.out.println("treeMap = " + treeMap);
        System.out.println("treeMap.get() = " + treeMap.get(6.4));
        treeMap.remove(5.8);
        System.out.println("treeMap.remove() = " + treeMap );
        System.out.println("treeMap.descendingMap() по убыванию = " + treeMap.descendingMap());
        System.out.println("treeMap.tailMap(7.3) от и выше = " + treeMap.tailMap(7.3));
        System.out.println("treeMap.headMap(7.3) от и ниже = " + treeMap.headMap(7.3));
        System.out.println("treeMap.lastEntry() самый высокий grade = " + treeMap.lastEntry());
        System.out.println("treeMap.firstEntry() самый наименьший grade = " + treeMap.firstEntry());
        System.out.println("-----------------------------------------------------------------------");

        TreeMap<Student, Double> treeMap1 = new TreeMap<>();
        Student st_1 = new Student("Zaur", "Tregulov", 3);
        Student st_2 = new Student("Mariya", "Ivanova", 1);
        Student st_3 = new Student("Sergey", "Petrov", 4);
        Student st_4 = new Student("Igor", "Sidorov", 2);
        Student st_5 = new Student("Vasiliy", "Smirnov", 1);
        Student st_6 = new Student("Sasha", "Kapustin", 3);
        Student st_7 = new Student("Elena", "Sidorova", 4);
        treeMap1.put(st_1,5.8);
        treeMap1.put(st_2, 9.1);
        treeMap1.put(st_3, 6.4);
        treeMap1.put(st_4, 7.5);
        treeMap1.put(st_5, 7.2);
        treeMap1.put(st_6, 8.2);
        treeMap1.put(st_7, 7.9);
        Student st_8 = new Student("Elena", "Sidorova", 4);
        System.out.println(treeMap1.containsKey(st_8));
    }

}
