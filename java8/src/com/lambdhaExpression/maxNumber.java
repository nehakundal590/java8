package com.lambdhaExpression;
interface Im{
	int max(int a,int b);
}

public class maxNumber {
	public static void main(String[] args) {
		Im max=(a,b)->(a>b)?a:b;
		int number1=10;
		int number2=20;
		System.out.println(max.max(number1,number2));
		
	}

	

}
