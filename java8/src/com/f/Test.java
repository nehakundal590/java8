package com.f;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Test implements Consumer {
	public void accept(Object i) {
		System.out.println(i);
	}
	public static void main(String[] args) {
		List<Integer>l1=new ArrayList<>();

		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(70);
		l1.add(60);
		for(Integer i:l1) {
			System.out.println(i);
			
			Stream<Integer>i2=l1.stream();
			Consumer<Integer>c=n->System.out.println(n);
			l1.forEach(c);
		}
		
	}

}
