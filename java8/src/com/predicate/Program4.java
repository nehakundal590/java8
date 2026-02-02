package com.predicate;


import java.util.*;
import java.util.function.Predicate;

public class Program4 {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,3,4,20,17,28);
		Predicate<Integer>p=n->n>10;
		for(Integer i:list) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}
		
				
	}

}
