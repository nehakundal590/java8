package com.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
//Functional interface SAM Predicate ,consumer,supplier

public class lecture12 implements Consumer<Object>{
	public void accept(Object t) {
		System.out.println(t);
	}
	 
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(15);
		list.add(10);
		list.add(15);
		list.add(18);
		list.add(14);
		list.add(13);
		System.out.println(list);
		/*for(Integer ie:list) {
			int result=ie*ie;
			System.out.println(result);
		}
		System.out.println(list);*/
		lecture12 l1=new lecture12();
		l1.accept(list);
		
		
	}

}
