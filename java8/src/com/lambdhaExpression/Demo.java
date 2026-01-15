package com.lambdhaExpression;

//Java 8 Functional Interface and Lambda Expression
//Functional Interface: An interface that contains only ONE abstract method
//Examples: Runnable, Predicate, Consumer, Callable

//Marker Interface: An interface with NO methods
//Examples: Cloneable, Serializable

//This is a Functional Interface because it has only one abstract method
interface I {

 // Abstract method (public and abstract are optional in interface)
 void m1();
}

public class Demo {

 public static void main(String[] args) {

     // Lambda Expression implementation of Functional Interface I
     // ()        -> no parameters
     // ->        -> lambda operator
     // System.out.println(...) -> method body of m1()
     I obj = () -> System.out.println("Show method...");

     // Calling the method implemented by Lambda Expression
     obj.m1();
 }
}

