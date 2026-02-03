package com.funct;


import java.util.function.Function;

public class Program2 {
	public static void main(String[] args) {
		String[]s = {"neha","bhawna","ritika","muskan"};
		Function<String,String>convertToUpperCase=ss->ss.toUpperCase();
		System.out.println(convertToUpperCase.apply(s[2]));
		System.out.println();
		for(String i:s) {
			System.out.println(convertToUpperCase.apply(i));

		}
	}

}

