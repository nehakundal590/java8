package com.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Intermediate
 * ***********
 * distinct
 * map
 * skip
 * limit
 * filter
 * 
 * Terminal:-
 * **********
 * forEach
 * count
 * 
 * Difference b/w intermediate or terminal
 * ***************************************
 * 
 * The difference between the Intermediate operation and the Terminal operation is that Intermediate operation
 *  return a stream as a result and the terminal operation return non stream value like primitive or object
 *  or collection or may not return anything.
 *  
 *  As Intermediate operation return another stream as a result, they can b chained together to form a pipeline of operation.
 *  Terminal operation can;t be chained together.
 *  
 *  Pipeline of operation can have any number of intermediate operation but there has to be only one terminal operation 
 *  that to at the end of the pipeline.
 *  
 *  distinct:- unique value remove duplicate
 *  limit:- accept that argument needed.
 *  skip:-skip value 
 *  sorted:-
 *  Reverse order sorted
 */

public class lecture9 {
	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(10,20,34,34,56,78,8,7,5,5);
		//numbers.stream().sorted((a,b)->-a.compareTo(b)).forEach(i->System.out.println(i));
		long value=numbers.stream().filter(i->i%2==0).count();
		System.out.println(value);
		List<Integer>evennumbers= new ArrayList<Integer>();
		List<Integer>oddnumbers= new ArrayList<Integer>();
		
		oddnumbers=numbers.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(oddnumbers);
		
	}

}
