package com.framework;

import java.util.ArrayList;

public class arrayList3 {
	public static void main(String[] args) {
		ArrayList <Integer>a1=new ArrayList();
         System.out.println(a1.size());
         System.out.println(a1.isEmpty());
         a1.add(10);
         a1.add(20);
         a1.add(30);
         a1.add(40);
         a1.add(50);
         a1.add(60);
         a1.add(70);
         a1.add(80);
         a1.add(90);
         a1.add(100);
         System.out.println(a1.isEmpty());
         System.out.println(a1.contains(a1));
         System.out.println(a1.size());
         System.out.println(a1.remove(0));
         System.out.println(a1.add(110));
         System.out.println(a1.remove(a1));
			
		}
	}


