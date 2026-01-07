package com.lambdhaExpression;

interface I7 {
    String convert(String s);
}

public class stringUpper {
    public static void main(String[] args) {

        I7 uc = (s) -> s.toUpperCase();

        System.out.println(uc.convert("java program"));
    }
}

