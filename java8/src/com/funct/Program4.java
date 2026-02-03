package com.funct;

import java.util.function.Function;

public class Program4 implements Function<Integer,String> {
	public String apply(Integer i) {
		return "numbers";
		
	}
	public static void main(String[] args) {
		Function<Integer,String>f=new Program4();
		System.out.println(f.apply(10));
		
		System.out.println();
		Function <Integer,String>f1=i->"neha";
		System.out.println(f1.apply(5));
	}

}
/*package com.funct;

import java.util.function.Function;

public class Program4 implements Function<Integer, String> {

    @Override
    public String apply(Integer i) {
        return "numbers";
    }

    public static void main(String[] args) {

        Function<Integer, String> f = new Program4();
        System.out.println(f.apply(10));

        Function<Integer, String> f1 = i -> "neha";
        System.out.println(f1.apply(5));
    }
}
*/