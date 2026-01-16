package com.function;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<Integer> p = n -> n > 18;

        System.out.println(p.test(20)); // true
        System.out.println(p.test(15)); // false
    }
}

