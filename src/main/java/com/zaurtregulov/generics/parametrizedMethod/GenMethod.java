package com.zaurtregulov.generics.parametrizedMethod;

import java.util.ArrayList;

public class GenMethod {
    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
}
