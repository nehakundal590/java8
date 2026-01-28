/*Functional Interface
Lambda Expression
Predicate
      |-functional interface SAM
        |-test(T t)
        
     interface Predicate<T>{
     boolean test(T t);
     }
     
  Predicate Joining
   or
   and
   negate
   
 Function :-
---> It is also a fumction interface that is introduced  in jdk1.8.
 ---->inside this interface a abstract method is R apply(T t)
 ---->Function inside the java.util.function
 
 Structure:-
 T------> String
 Upper Case Ex:- prasoon------------->PRASOON
 public interface Function<T,R>{
      R  apply(T t);
     
     }
   T-------------->input
   R-------------->Output
   
 Ex:-
   public interface Function<String ,String>{
     String apply(String s);
 */       

package com.function;

import java.util.function.Function;
//Write a program to convert the String in Upper case
//Without Lambda Expression

public class lecture5 implements Function<String,String> {
	public String apply(String s) {
		return s.toUpperCase();
	}
	public static void main(String[] args) {
		
		Function<String,String>ConvertToUpperCase=new lecture5();
		
		System.out.println(ConvertToUpperCase.apply("neha"));
	}
		}

//--------------with lambda Expression

/*Function<String , String>ConvertToUpperCase=s->s.toLowerCase();
System.out.println(ConvertToUpperCase.apply("neha"));

*/

/* String name[]={"neha","swati","muskan"};
 * Function<String,String> ConvertToUpperCase=s->s.toUpperCase();
 * for(String ss:name){
 * System.out.println(ConvertToUpperCase.apply(ss));
 */
 
