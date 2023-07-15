package com.zaurtregulov.lambda;

public class Test2 {
    static void def(I i) {
        System.out.println(i.abc("hello!"));
    }

    public static void main(String[] args) {
        int i = 10;
        def((String s) -> {
            int a = 5;
            System.out.println(i); return s.length()+i;});
        System.out.println();
    }
}

interface I {
    int abc(String s);
}
