package com.lambdaExpression;

import java.util.function.Predicate;

public class pallidrome {
    public static void main(String[] args) {

        Predicate<String> isPalindrome = s ->
                s.equals(new StringBuilder(s).reverse().toString());

        System.out.println("121 is Palindrome: " + isPalindrome.test("121"));
        System.out.println("JAVA is Palindrome: " + isPalindrome.test("JAVA"));
        System.out.println("MADAM is Palindrome: " + isPalindrome.test("MADAM"));
    }
}

