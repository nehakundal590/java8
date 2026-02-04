package com.supplier;



import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        Supplier<String> s = () -> "Hello Java 8";

        System.out.println(s.get());
    }
}
