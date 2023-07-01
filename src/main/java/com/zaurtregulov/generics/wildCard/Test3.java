package com.zaurtregulov.generics.wildCard;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();
        List<? extends Number> list30 = new ArrayList<>();
        List<? super Number> list31 = new ArrayList<Object>();


        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("ok");
        list2.add("privet");
        list2.add("poka");
        showListInfo(list2);

        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(3.14);
        doubleArrayList.add(3.15);
        doubleArrayList.add(3.16);
        System.out.println(sum(doubleArrayList));

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(3);
        integerArrayList.add(35);
        integerArrayList.add(30);
        System.out.println(sum(integerArrayList));
    }

    static void showListInfo(List<?> list) {
        System.out.println("Мой лист содержит следующие элементы " + list);
    }

    public static double sum(ArrayList<? extends Number> arrayList) {
        double sum = 0;
        for (Number n : arrayList) {
            sum += n.doubleValue();
        }
        return sum;
    }

}
