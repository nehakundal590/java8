package com.funct;


import java.util.function.Function;

	//write a program to convert the string in toUpperCase
	
	public class Program1 implements Function<String,String>{
		public String apply (String s) {
			return s.toUpperCase( );
		}
	
	public static void main(String[] args) {
		Function<String,String>f=new Program1();
		System.out.println(f.apply("neha"));
		
		
		// with lambda function
		System.out.println();
		System.out.println("with lambda  expression");
		Function<String,String>f1=s->s.toUpperCase();
		System.out.println(f1.apply("neha kundal"));
	}

}

