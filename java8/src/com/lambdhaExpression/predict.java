package com.lambdhaExpression;

// Predicate is a built-in Functional Interfac present in java.util.function
// It takes ONE input and returns a boolean value (true / false)
import java.util.function.Predicate;

public class predict {

    public static void main(String[] args) {

        // Creating a Predicate using Lambda Expression
        // <Integer>  -> Predicate works on Integer type
        // i          -> input value
        // i % 2 == 0 -> checks whether the number is even
        // if number is even -> returns true
        // else -> returns false
        Predicate<Integer> p1 = i -> {
            if (i % 2 == 0) {
              return true;   // even number
            } else {
                return false;  // odd number
            }
        };

        // test() is the abstract method of Predicate interface
        // Passing value 10 to test()
        // It will return true because 10 is even
        System.out.println(p1.test(10));
    }
}
