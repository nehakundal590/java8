package com.lambdhaExpression;

interface I8 {
    int calculate(int n);
}

public class squareNumber {
    public static void main(String[] args) {

        I8 sq = n -> n * n;

        System.out.println(sq.calculate(5)); // Pass an integer here
    }
}
