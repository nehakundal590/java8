/*package com.predicate;

import java.util.function.Predicate;

public class Program2 implements Predicate<String> {
	
	public boolean test(String s) {
		return s.length()>5;
	}
	public static void main(String[] args) {
		Predicate<String> p=new Program2();
		System.out.println(p.test("neha"));
		System.out.println(p.test("kundal"));
		}
}
*/
//----------------------------------with lambda expression
/*package com.predicate;

import java.util.function.Predicate;

public class Program2{
	public static void main(String[] args) {
		Predicate<String>p=(s)->s.length()>5;System.out.println("neha");
		
	}
}
*/
//------------------with anaymous class 

package com.predicate;

import java.util.function.Predicate;

public class Program2{
	public static void main(String[] args) {
		Predicate<String>p=new Predicate<String>() {
		public boolean test(String s) {
		return s.length()>5;
		
		}
		};
		System.out.println(p.test("neha"));
		
	}
	}
