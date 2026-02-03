package com.funct;

import java.util.function.Function;

public class Program3 {
	public static void main(String[] args) {
		Function<String,Integer>f=s->s.length();
		System.out.println(f.apply("neha"));
		System.out.println(f.apply("kundal"));
		
		Function<Integer,Integer>square=n->n*n;
		System.out.println(square.apply(5));
	}

}
/*package com.funct;

import java.util.function.Function;

public class Program3 {
	public static void main(String[] args) {

		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("neha"));
		System.out.println(f.apply("kundal"));

		Function<Integer, Integer> square = n -> n * n;
		System.out.println(square.apply(5));   // ✅ correct
	}
}*/
