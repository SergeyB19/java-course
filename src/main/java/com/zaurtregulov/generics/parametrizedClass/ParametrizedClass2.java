package com.zaurtregulov.generics.parametrizedClass;

public class ParametrizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("hello",20);
        System.out.println("Значение пары value1 = " + pair1.getFirstValue() + ", value2 = " + pair1.getSecondValue());
        Pair<Integer, Double> pair2 = new Pair<>(156,3.14);
        System.out.println("Значение пары value1 = " + pair2.getFirstValue() + ", value2 = " + pair2.getSecondValue());
        OtherPair<String> otherPair = new OtherPair<>("ok", "poka");
        System.out.println("Значение пары value1 = " + otherPair.getFirstValue() + ", value2 = " + otherPair.getSecondValue());
    }
}
