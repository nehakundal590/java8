package com.lambdhaExpression;

//Functional Interface
//This interface contains only ONE abstract method,
//so it can be used with Lambda Expression
interface I3 {

 // Abstract method to add two numbers
 void addNumber(int a, int b);
}

public class addNumber {

 public static void main(String[] args) {

     // Lambda Expression implementation of Functional Interface I3
     // (a, b)  -> parameters passed to the method addNumber()
     // ->      -> lambda operator
     // System.out.println(...) -> body of the addNumber() method
     // (a + b) -> performs addition of two numbers
     I3 ic = (a, b) -> System.out.println("Addition of two numbers: " + (a + b));

     // Calling the addNumber() method using lambda expression
     // Here, a = 10 and b = 20
     ic.addNumber(10, 20);
 }
}

