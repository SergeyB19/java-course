package com.zaurtregulov.collection.list_interface;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Ivan");
        System.out.println(arrayList1);
//        ArrayList<String> arrayList2 = new ArrayList<String>();
//        arrayList2.add("!!!");
//        arrayList2.add("???");
//        arrayList1.addAll(1,arrayList2);
//        System.out.println(arrayList1);
//        arrayList1.clear();
        System.out.println(arrayList1.indexOf("Ivan"));
        System.out.println(arrayList1.lastIndexOf("Ivan"));
        System.out.println("arrayList1.size() = " + arrayList1.size());
        System.out.println("arrayList1.isEmpty() = " + arrayList1.isEmpty());
        System.out.println("arrayList1.contains() = " + arrayList1.contains("Kolya"));
        System.out.println("arrayList1.contains() = " + arrayList1.contains("Mariya"));
        System.out.println("arrayList1.toString() = " + arrayList1.toString());
    }
}
