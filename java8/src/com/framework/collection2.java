package com.framework;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class collection2 {
	public static void main(String[] args) {
		//array--------List
		String arr[]= {"Java","python","C=="};
		
		List<String>list=  Arrays.asList(arr);
		List<String>list1=new ArrayList<>(Arrays.asList(arr));
		System.out.println(list1);
		
		//array------>set
		 String arr1[]= {"A","B","C","A"};
		Set<String>set=new HashSet<>(Arrays.asList(arr1));
		System.out.println(set);
		
		//convert collection list------->array
		List<String>list3= new ArrayList<>();
		list3.add("java");
		list3.add("python");
		list3.add("C++");
		System.out.println(list3);
		
		//to convert in into array
		   String  array[]=list.toArray(new String[0]);
		   
		  // print array
		   for(String ss1:array);
		   System.out.println("ss1");
		   
		   //convert into Set
		   
		   Set<String>set1= new HashSet<>();
		   
		   set1.add("50");
		   set1.add("40");
		   set1.add("70");
		   set1.add("90");
		   set1.add("30");
		   set1.add("60");
		   System.out.println(set1);
		   
		  // convert it into array
		   
		Integer[] arr2 = set.toArray(new Integer[0]);
		   
		  System.out.println(Arrays.toString(arr2));
		    
		}

}
