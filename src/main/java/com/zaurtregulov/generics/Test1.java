package com.zaurtregulov.generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public Car car;
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("OK");
//        list.add(5);
//        list.add(5);
//        list.add(new StringBuilder("StringBuilder"));
//        list.add(new Car());
        list.add("Привет");
        list.add("Пока");
        list.add("Ок");
        list.add("Без разницы что добавлять");

        for (Object o : list) {
            System.out.println(o + " Длина " + ((String)o).length());
        }
    }
}
