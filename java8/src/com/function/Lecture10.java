
/* Difference b/w map() vs flatMap()
 * 
 * 
 * single input value=single output value
 * It is performing --- One to one mapping
 * It perform operation on one to many mapping
 * When you pass function to a flatMap for one input value it could generate arbitery key number of value as the output
 * 
 * Flat map is going to produce again the stream of values
 */







package com.function;

import java.util.Arrays;
import java.util.List;

public class Lecture10 {
	public static void main(String[] args) {
		List<Integer>l1=Arrays.asList(1,2,3);
		List<Integer>l2=Arrays.asList(1,7,3);
		List<Integer>l3=Arrays.asList(8,2,8);
		List<Integer>l4=Arrays.asList(1,0,2);
		List<List<Integer>> complex=Arrays.asList(l1,l2,l3,l4);
		
		complex.stream().flatMap(i->i.stream()).map(i->i+i).forEach(i->System.out.println(i));
	}

}
