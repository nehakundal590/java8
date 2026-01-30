
/*
 * Consumer---->biConsumer
 * Predicate---->biPredicate
 * Function----->biFunction
 * Supplier-----> do not support biSupplier
 * 
------Predicate
 * A function that accepts an argument and in return and generate boolean value as an answer is know as integer.
 * -----BiPredicate
 * The biPredicate interface is also an extension of the predicate function interface , which instead of one take two arguments does some processing and return the boolean value
 * 
 * Example:-
 * 
 * boolean test(T parameter,U parameter);
 * SAM inside the biPredicate
 * 
 * return boolean value
 * 
 * Q1.What is the difference between predicate and biPredicate?
 * 
 *   Predicate:- public interface Predicate<T>{
 *   boolean Test(T t);
 *  inside the package--> java.util.function
 *  
 *  
 *  BiPredicate:- It is also inside the java.util.function
 *  accept two argument
 *  
 *  *******Consumer 
 *  Consumer interface is the functional interface accept only one argument.
 *  It return nothing
 *  
 *  Example:--- public interface Consumer<T>{
 *  void accept(T t);
 *  
 *  Accept one argument 
 *  
 *  ******BiConsumer
 *  public interface Consumer<T,U>{
 *  void accept(T t);
 * 
 */
package com.function;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/*Predicate--------boolean test
 * Bi-Prediacte-----boolean test(T t)
 * 
 * Consumer------void accept(T t)
 * Bi-Consumer----void accept (T t, U u)
 * 
 * Function-------R apply (T  t);
 * Bi-Function---------<T,U,R>----->R apply (T  t,  U u);
 * 
 * Supplier-----it is also a functional interface it doesn't take any argument or input and get return the single output
 * their is no BiSupplier because it doesn't take any argument and any method can have one return type BiSupplier not possible
 * 
 Example:-public interface Supplier<T>{
 T get();
 */
public class lecture7 {
	public void accept(Integer t) {
		System.out.println(t);
	}
	public static void main(String[] args) {
		
		
		/*BiPredicate<String,String>ref=(a1,a2)->a1.equals(a2);
		System.out.println(ref.test("neha", "neha"));*/
		
		//Consumer<Integer>c= t->System.out.println(t);
	//	c.accept(10);
		
	//	BiConsumer<Integer,Integer>ref=(a,b)->System.out.println(a+b);
	//	ref.accept(10, 20);
		

		  Function<String, Integer> f1 = s1 -> s1.length();
	        System.out.println(f1.apply("Neha Devi"));
	        
	        BiFunction<String,String,Integer> bm=(s1,s2)->s1.length()+s2.length();
	        System.out.println(bm.apply("neha", "devi"));
	        
	        Supplier<String> s1=()->"Hello world";
			System.out.println(s1.get());
		}
}
//Q-----

