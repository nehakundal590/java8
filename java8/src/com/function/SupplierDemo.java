package com.function;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {

        Supplier<Integer> s = () -> 100;

        System.out.println(s.get());
    }
}

