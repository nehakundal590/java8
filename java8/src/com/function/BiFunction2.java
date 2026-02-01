package com.function;



import java.util.function.BiFunction;

class ConcatStrings implements BiFunction<String, String, String> {
    public String apply(String s1, String s2) {
        return s1 + " " + s2;
    }
}

public class BiFunction2 {
	public static void main(String[] args) {
		BiFunction<String, String, String> g = new ConcatStrings();
		System.out.println(g.apply("Neha", "kundal"));
		
		
		// with lambda function
		BiFunction<String, String, String> gn = (a, b) -> a + " " + b;
		System.out.println(gn.apply("Java","Programming"));
	}

}
