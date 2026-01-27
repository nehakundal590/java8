/*Predicate function interface in jdk 1.8 
 * 
 * 1.Predicate
 * 2.Function
 * 3.Consumer
 * 4.Supplier
 */
 /* Q1:What is predicate?
  * 1.It is a functional interface that was introducd in jdk 1.8 version.
  * 2.It is available in java.util.function package.
  * 3.It has an abstract method which is test() method.
  * 4.Prototype
  * 
  * T:-Any type
  * interface Predicate<T>
  * {
  * boolean test(T t);
  * }
  * 
  * 5. It is used extensively in functional programming and Stream Operation.
  */

/*Q2: How to use predicate?
 * Please be informed that you can use this predicate to refer lambda expression.
 */
package com.function;

import java.util.function.Predicate;

//Predicate---> functional interface
//java.util.function;

public class lecture3 implements Predicate<Integer>{
	//Write a logic if number is greater than 100 or not
	// without using lambda expression
	@Override
	public boolean test(Integer t) {
		if(t>100) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		Predicate<Integer>p=new lecture3();
		System.out.println(p.test(1000));
		System.out.println(p.test(10));
		System.out.println(p.test(100));
		System.out.println(p.test(2000));
		
	}
	
}
// Predicate with using lambda expression
  /*public class lecture31{
	  public static void main(String[] args) {
		Predicate<Integer>p=(t)->{
			if(t>100) {
				return true;
			}
			else {
				return false;
			}
		};
		//Predicate<Integer>p=t->t>100;
	
		System.out.println(p.test(1000));
		System.out.println(p.test(100));
		System.out.println(p.test(2000));
		System.out.println(p.test(3000));
	}
  }*/
  

