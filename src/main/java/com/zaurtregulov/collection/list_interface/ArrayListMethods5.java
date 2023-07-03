package com.zaurtregulov.collection.list_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");
        List<Integer> list1 = List.of(3,8,13);
        System.out.println("list1 = List.of = " + list1);
        List<String> list2 = List.copyOf(arrayList1);
        System.out.println("list2 = List.copyOf = " + list2);


        System.out.println(arrayList1);

        Object[] array = arrayList1.toArray();
        String array2 = Arrays.toString(arrayList1.toArray(new String[0]));
        System.out.println("array2 = " + array2);

        List<String> myList = arrayList1.subList(1, 4);
        System.out.println("myList = " + myList);
        myList.add("Fedor");
        System.out.println("myList = " + myList);
        System.out.println("arrayList1 + myList = " + arrayList1);
        arrayList1.add("Sveta");
        System.out.println("arrayList1 = " + arrayList1);


        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("Ivan");
        arrayList2.add("Mariya");
        arrayList2.add("Igor");

        arrayList1.removeAll(arrayList2);
        System.out.println("arrayList1 = " + arrayList1);

        boolean result = arrayList1.containsAll(arrayList2);
        System.out.println("result containsAll = " + result);
    }
}
