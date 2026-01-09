package com.framework;
import java.util.*;


public class arrayList {
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<>();
		a1.add(10);
		a1.add(89);
		a1.add(50);
		a1.add(60);
		System.out.println(a1.get(2));
		
		Vector v=new Vector();
		System.out.println(v.capacity());
		
	}

}
