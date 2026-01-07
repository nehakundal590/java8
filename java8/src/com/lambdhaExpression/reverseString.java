package com.lambdhaExpression;
interface rv{
	String reverse(String s);
}

public class reverseString {
	public static void main(String[] args) {
		rv I=(s)->new StringBuilder(s).reverse().toString();
		System.out.println(I.reverse("JavaProgramming"));
	}

}
