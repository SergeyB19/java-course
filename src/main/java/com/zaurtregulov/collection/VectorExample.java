package com.zaurtregulov.collection;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Zaur");
        vector.add("Misha");
        vector.add("Oleg");
        vector.add("Katya");
        System.out.println("vector = " + vector);
        System.out.println("vector.firstElement() = " + vector.firstElement());
        System.out.println("vector.firstElement() = " + vector.lastElement());
        vector.remove(2);
        System.out.println(vector);
        System.out.println(vector.get(1));
    }
}
