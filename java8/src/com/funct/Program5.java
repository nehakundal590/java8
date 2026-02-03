package com.funct;

import java.util.function.Function;

public class Program5 {
	public static void main(String[] args) {
		Function<String,String>f=s->s.replaceAll(" ","");
		System.out.println(f.apply("I am neha"));
		
		Function<String,Integer>f1=s1->s1.length();
		System.out.println(f1.apply("nehakundal"));
	}

}
