package com.function;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import com.framework.list;

public class lecture12Example {
	public static void main(String[] args) {
		
	
	List<Integer>l1=new ArrayList<>();
	l1.add(10);
	l1.add(20);
	l1.add(10);
	l1.add(17);
	l1.add(14);
	System.out.println(l1);
	//Collections.sort(l1);
	/*Consumer <Integer>c1=new Consumer<>() {
		public void accept(Integer t) {
			System.out.println(t);
		};
	};
	Consumer <Integer>c2=(t)->System.out.println(t);
	l1.forEach(c1);*/
	Stream<Integer>streamData=l1.stream();
	Stream<Integer>sortedStream=streamData.sorted();
	sortedStream.forEach(i->System.out.println(i));
	System.out.println(l1);

	}

}
