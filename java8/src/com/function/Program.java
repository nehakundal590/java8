package com.function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
public class Program{
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(3);
		list.add(9);
		list.add(50);
		System.out.println(list);
		//Collections.sort(list);
		//System.out.println(list);
		Stream<Integer>streamdata=list.stream();
		Stream<Integer>sortedstream=streamdata.sorted();
		sortedstream.forEach(n->System.out.println(n));
		System.out.println(list);
		//-------------------------------
		list.stream().filter(i->i%2==0).forEach(i->System.out.println(i));
		System.out.println(list);//filter
		
		list.stream().map(n->n*n).forEach(i->System.out.println(i));
		System.out.println(list);
		//map
		list.stream().filter(i->i%2==0).map(n->n*n).forEach(i->System.out.println(i));
		System.out.println(list);
		//---------distinct
		
		list.stream().distinct().forEach(i->System.out.println(i));
		System.out.println(list);
		//----------limit
		
		list.stream().limit(3).forEach(i->System.out.println(i));
		System.out.println(list);
		//------------skip
		
		list.stream().skip(2).forEach(i->System.out.println(i));
		System.out.println(list);
		
		
		
	}

}

