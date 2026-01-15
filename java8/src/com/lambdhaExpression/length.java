package com.lambdhaExpression;

//Functional Interface
//Contains only ONE abstract method, so it supports Lambda Expression
interface I2 {

 // Abstract method that accepts a String parameter
 void m1(String s);
}

public class length {

 public static void main(String[] args) {

     // Lambda Expression implementation of interface I2
     // s           -> String parameter passed to m1()
     // ->          -> lambda operator
     // s.length()  -> calculates the length of the given String
     // System.out.println(...) -> prints the result
     I2 i1 = s -> System.out.println("The length of the String is: " + s.length());

     // Calling m1() method using lambda expression
     // "NehaDevi" is passed as argument to the method
     i1.m1("NehaDevi");
 }
}

