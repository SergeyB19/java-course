package com.zaurtregulov.generics.parametrizedClass;

public class Parent {
    public void abc(Info<String> info) {
        String s = info.getValue();
    }
}
