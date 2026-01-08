
package com.lambdhaExpression;

interface Palindrome {
    boolean check(String s);
}

public class pallidromeString {
    public static void main(String[] args) {

        Palindrome p = (s) -> {
            String rev = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                rev = rev + s.charAt(i);
            }
            return s.equals(rev);
        };

        System.out.println(p.check("madam"));  // true
        System.out.println(p.check("java"));   // false
    }
}

