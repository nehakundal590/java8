/*package com.predicate;

import java.util.function.Predicate;

//Even number with or without lambda expression

public class program1 implements Predicate<Integer> {
	public boolean test(Integer i) {
		return i%2==0;
	}
	public static void main(String[] args) {
		Predicate<Integer>p=new program1();
		System.out.println(p.test(10));
		}

}*/

//------------------------------------with lambda expression
/*package com.predicate;
import java.util.function.Predicate;
public class program1{
	public static void main(String[] args) {
		Predicate<Integer>p=(i)->i%2==0; System.out.println(p.test(10));
	}
}*/

//-----------------------------------------with anaymous inner class
 package com.predicate;

import java.util.function.Predicate;

public class program1{
	 public static void main(String[] args) {
		 Predicate<Integer>p=new Predicate<Integer>() {
			 public boolean test(Integer i) {
				 return i%2==0;
			 }
		 };
		 System.out.println(p.test(10));
		
	}
 }