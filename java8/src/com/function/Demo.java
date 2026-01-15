package com.function;
//Predicate----- boolean test(T t)
//bi-Predicate---- boolean test(T t   U u)
//consumer ------- accept(T t)
//bi-consumer--------accept(T t   U u)


import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Demo {
	public static void main(String[] args) {
		//Predicate
		/*int a=10;
		Predicate<Integer> p=n -> n%2==0;
			System.out.println(p.test(a));*/
			
			
			//Bi-predicate
			/*BiPredicate<String ,String> ref=( a1, a2)-> a1.equals(a2);
			System.out.println(ref.test("neha","neha"));*/
			//consumer
			Consumer<Integer> c= t-> System.out.println(t);
			c.accept(10);
					
		}
	}


