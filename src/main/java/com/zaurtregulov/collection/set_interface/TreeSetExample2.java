package com.zaurtregulov.collection.set_interface;

import java.util.TreeSet;

public class TreeSetExample2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Zaur",5);
        Student st2 = new Student("Misha",1);
        Student st3 = new Student("Igor",2);
        Student st4 = new Student("Marina",3);
        Student st5 = new Student("Olya",4);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        System.out.println("treeSet = " + treeSet);
        Student st6 = new Student("Oleg",2);
        Student st7 = new Student("Oleg",4);
        System.out.println("treeSet.first() = " + treeSet.first());
        System.out.println("treeSet.last() = " + treeSet.last());
        System.out.println("treeSet.headSet(st6) ниже текущего курса 3 = " + treeSet.headSet(st6));
        System.out.println("treeSet.tailSet(st6) текущий курс либо выше = " + treeSet.tailSet(st6));
        System.out.println("treeSet.subSet(st6, st7) =( >=2&&<4)" + treeSet.subSet(st6, st7));
        System.out.println("st3.equals(st6) = " + st3.equals(st6));
        System.out.println("st3.hashCode() = " + st3.hashCode());
        System.out.println("st6.hashCode() = " + st6.hashCode());
        System.out.println(st3 == st6);
    }
}
