package com.framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*public class collectionToArray {
	public static void main(String[] args) {
		String arr[]= {"python","java","C+="};
		List<String>List= Arrays.asList(arr);
		System.out.println(List);
		
		String arr1[]= {"a","b","a","b"};
		//Set<String>set=  new HashSet<>(Arrays.asList(arr1));
		Set<String> set = new HashSet<>(Arrays.asList(arr));

		System.out.println(arr1);
		
		//convert collection list to array
		
		List<String>list1= new  ArrayList<>();
		
		list1.add("python");
		list1.add("java");
		list1.add("C+=");
		System.out.println(list1);
		
	   String	array[]=List.toArray(new String[0]);
	   for(String ss:array)
	   System.out.println();
		
	   
	   //set
	   
	   Set<String>set3= new HashSet<>();
	   set3.add(39);
	   set3.add(59);
	   set3.add(99);
	   
	 Integer[] arr4= set.toArray(new Integer[0]);
	 System.out.println(Arrays.toString(arr4));
	   
	   
	}*/



public class collectionToArray {
    public static void main(String[] args) {

        // Array to List
        String arr[] = {"python", "java", "C++"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list);

        // Array to Set (remove duplicates)
        String arr1[] = {"a", "b", "a", "b"};
        Set<String> set = new HashSet<>(Arrays.asList(arr1));
        System.out.println(set);

        // List to Array
        List<String> list1 = new ArrayList<>();
        list1.add("python");
        list1.add("java");
        list1.add("C++");

        String[] array = list1.toArray(new String[0]);
        for (String ss : array) {
            System.out.println(ss);
        }

        // Integer Set to Array
        Set<Integer> set3 = new HashSet<>();
        set3.add(39);
        set3.add(59);
        set3.add(99);

        Integer[] arr4 = set3.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr4));
    }
}

