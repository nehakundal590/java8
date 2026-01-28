package com.function;



import java.util.Arrays;
import java.util.List;
import java.util.*;
		import java.util.stream.*;

		public class StreamAPI {
		    public static void main(String[] args) {

		        List<Integer> list = Arrays.asList(2, 2, 6, 7, -11, 14, 19);

		        // Print all elements
		        System.out.println("All elements:");
		        list.stream().forEach(n -> System.out.println(n));

		        // Elements >= 10
		        System.out.println("Elements >= 10:");
		        list.stream().filter(i -> i >= 10).forEach(System.out::println);

		        // Even numbers
		        System.out.println("Even numbers:");
		        list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

		        // Odd numbers
		        System.out.println("Odd numbers:");
		        list.stream().filter(i -> i % 2 != 0).forEach(System.out::println);

		        // Squares of elements
		        System.out.println("Squares:");
		        list.stream().map(i -> i * i).forEach(System.out::println);

		        // Distinct elements
		        System.out.println("Distinct elements:");
		        list.stream().distinct().forEach(System.out::println);

		        // Remove negative numbers
		        System.out.println("Non-negative elements:");
		        list.stream().filter(n -> n >= 0).forEach(System.out::println);

		        // Multiply by 2
		        System.out.println("Elements * 2:");
		        list.stream().map(n -> n * 2).forEach(System.out::println);

		        // Count of elements
		        System.out.println("Count:");
		        System.out.println(list.stream().count());

		        // Sum of elements
		        System.out.println("Sum:");
		        System.out.println(list.stream().mapToInt(Integer::intValue).sum());

		        // Average
		        System.out.println("Average:");
		        System.out.println(list.stream().mapToDouble(Integer::intValue).average().getAsDouble());

		        // Sorted elements
		        System.out.println("Sorted elements:");
		        list.stream().sorted().forEach(System.out::println);
		    }
		}

		        
		        
		        
		        
		        

		        
		        