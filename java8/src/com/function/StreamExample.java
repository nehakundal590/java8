package com.function;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

        // Sample integer and string lists
        List<Integer> list = Arrays.asList(2, 2, 6, 7, -11, 14, 19);
        List<String> list1 = Arrays.asList("abc", "dffe", "ABCE", " ", "BSIKDM");

        // Question 1: Numbers greater than 10
        System.out.println("Numbers greater than 10:");
        list.stream().filter(i -> i > 10).forEach(n -> System.out.println(n));
        System.out.println();

        // Question 2: Square of numbers
        System.out.println("Square of numbers:");
        list.stream().map(i -> i * i).forEach(square -> System.out.println(square));
        System.out.println();

        // Question 3: Strings with length > 5
        System.out.println("Strings with length > 5:");
        list1.stream().filter(i -> i.length() > 5).forEach(n -> System.out.println(n));
        System.out.println();

        // Question 4: Strings starting with "a"
        System.out.println("Strings starting with 'a':");
        list1.stream().filter(i -> i.startsWith("a")).forEach(n -> System.out.println(n));
        System.out.println();

        // Question 5: Numbers greater than 0
        System.out.println("Numbers greater than 0:");
        list.stream().filter(i -> i > 0).forEach(n -> System.out.println(n));
        System.out.println();

        // Question 6: Employee salary >= 50000
        List<Integer> salary = Arrays.asList(55000, 60000, 50000, 73000);
        System.out.println("Salary greater than or equal to 50000:");
        salary.stream().filter(i -> i >= 50000).forEach(n -> System.out.println(n));
        System.out.println();

        // Question 7: Product price >= 1000
        List<Integer> productPrice = Arrays.asList(2000, 1500, 1000, 2300, 950, 800);
        System.out.println("Product price greater than or equal to 1000:");
        productPrice.stream().filter(i -> i >= 1000).forEach(n -> System.out.println(n));
        System.out.println();

        // Question 8: String length * 5
        System.out.println("String length multiplied by 5:");
        list1.stream().map(i -> i.length() * 5).forEach(n -> System.out.println(n));
        System.out.println();

        // Question 9: Double of integers
        List<Integer> intList = Arrays.asList(10, 20, 30, 40, 50);
        List<Double> doubleList = intList.stream().map(i -> i * 2.0) .toList();
        System.out.println("Double values of integers:");
        doubleList.stream().forEach(i -> System.out.println(i));
        System.out.println();

        // Question 10: Custom calculation (x * 2 + 5)
        System.out.println("Custom calculation (x*2 + 5):");
        list.stream().map(x -> (x * 2) + 5).forEach(n -> System.out.println(n));
        System.out.println();
    }
}

