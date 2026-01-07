
package com.lambdhaExpression;

interface I9 {
    int lastChar(String s);
}

public class lastChar {
    public static void main(String[] args) {

        I9 sc = (s) -> s.charAt(s.length() - 1);

        System.out.println("Last character: " + (char) sc.lastChar("javaProgramming"));
    }
}
