package com.function;

import java.util.function.Function;

//java programming language---->input
//javaprogramminglanguage------>output
//Remove the Space------------->inbuilt method
//count space---------->
//length with space - length without space

public class Lecture5Example {
	public static void main(String[] args) {
		Function<String,String>ConvertToUpperCase=s->s.toUpperCase();
		
		Function<String, String> convertToUpperCase = s -> s.toUpperCase();

        Function<String, String> f1 = s1 -> s1.replaceAll(" ", "");

        Function<String, Integer> f2 = s2 -> s2.length();

		System.out.println(f2.apply("java programming language"));
		
	}
}


//-----------with lambda expression
/*String s="java programming language";
Function<String,Integer>f1=s1->s1.length()-s1.replace(" ", "").length();
System.out.println(f1.apply(s));*/
