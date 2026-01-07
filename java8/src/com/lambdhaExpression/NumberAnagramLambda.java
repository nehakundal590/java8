package com.lambdhaExpression;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class NumberAnagramLambda {
    public static void main(String[] args) {
        int num1 = 1234;
        int num2 = 4321;

        // Lambda to check if two numbers are anagrams
        BiPredicate<Integer, Integer> isAnagram = (n1, n2) -> {
            char[] arr1 = String.valueOf(n1).toCharArray();
            char[] arr2 = String.valueOf(n2).toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2);
        };

        // Using the lambda
        System.out.println(num1 + " and " + num2 + 
            (isAnagram.test(num1, num2) ? " are anagrams" : " are NOT anagrams"));
    }
}



	
