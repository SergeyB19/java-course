package com.zaurtregulov.collection;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add(1,"Misha");
        for (String s : arrayList1) {
            System.out.println(s);
        }
        System.out.println("*_*_*_*_*_*_*_*_*_*_*");
        System.out.println(arrayList1.get(2));
        System.out.println("*_*_*_*_*_*_*_*_*_*_*");
        for (int i = 0; i < arrayList1.size(); i++) {
            System.out.println(arrayList1.get(i));
        }
        System.out.println("set");
        arrayList1.set(1, "Masha");
        System.out.println(arrayList1);
        System.out.println("remove");
        arrayList1.remove(0);
        System.out.println(arrayList1);

    }
}
