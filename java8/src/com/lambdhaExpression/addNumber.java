package com.lambdhaExpression;
interface I3{
	void addNumber(int a,int b);
	
}

public class addNumber {
	public static void main(String[] args) {
		I3 ic=(a,b)->System.out.println("addition of two number:"+(a+b)); 
		ic.addNumber(10,20);
	}

}
