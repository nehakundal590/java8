package com.function;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        Consumer<String> c = name -> 
            System.out.println("Hello " + name);

        c.accept("Neha");
    }
}


