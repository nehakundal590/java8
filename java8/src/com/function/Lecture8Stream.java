/*Collection vs Stream
 ********************* 
 * 1.Collection are mainly used to store and group the data.
 * Stream are mainly used to perform the operation on the already Stored data.
 * 
 * 2.Collection have to be iterated externally.
 * Stream are internally iterated.
 * 
 * 3.You can add and remove Elements from the collection.
 * You can't add and remove elements from the Stream.
 * 
 * 4.Collection can be traversed multiple times.
 * Stream are travereble only once because the stream is said to consumed already
 * or Operated upon when it is used Once.
 * 5.Collection are eagerly Constructed.
 * Stream are LAzily Constructed.
 * 
 * Stream:-
 * ********
 * The stream method is inside the stream interface that is the part of Stream
 * API's introduced in jdk1.8
 * 
 * It is used to create a sequential Stream from the collection Object
 * its return type is Stream<E> stream();
 * 
 * Filter:-
 * *********
 * The filter () method is used to process the stream of elements and retain only
 * those matches the specified condition.
 * 
 * The filter() method accept the Predicate as the argument.
 * 
 * Predicate --> Takes any input--->the return type is always going to be boolean
 * type.
 * Please be informed that the filter method takes any number of input object,
 * but the resultant Object cloud be same as the number of input
 * Object are lesser than the input object.
 * 
 * map():-
 * *******
 * Please be informed that the method is part of Stream APIs.
 * It allows to perform the transformation of elements in the Stream.
 * It is going to take function as the argument.
 * 
 */







package com.function;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Lecture8Stream {
	public static void main(String[] args) {
		ArrayList<Integer>numbers=new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		System.out.println(numbers);
		
		/*Stream<Integer>streamOfNumber=numbers.stream();
		streamOfNumber.forEach(i->System.out.println(i));*/
		
		/*filter (Integer a:number){
		 * if(a%2==0){
		 * System.out.println(a);
		 */
		
		//jdk1.8*******
		/*Predicate<Integer>p=i->i%2==0;
		numbers.stream().filter(p).forEach(j->System.out.println(j));*/
		
		numbers.stream().filter(i->i%2==0).forEach(j->System.out.println(j));
		
	}

}
