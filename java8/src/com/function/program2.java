package com.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class program2 {
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		List<String> list1 = Arrays.asList("java", "python", "spring");
      
		list.add(10);
		list.add(50);
		list.add(60);
		list.add(30);
		list.add(5);
		
		/*Stream<Integer>streamdata=list.stream();
		System.out.println(list);
		list.stream().filter(i->i%2==0).forEach(i->System.out.println(i));
		System.out.println(list);//even

		list.stream().distinct().forEach(i->System.out.println(i));
		System.out.println(list);
		//----------distinct Q9
		Stream<Integer>streamdata1=list.stream();
		Stream<Integer>sortedstream=streamdata1.sorted(); //sorted
		long count = list.stream().count();
         System.out.println(count);    //count
        

        list.stream().filter(i -> i % 2 != 0).forEach(i -> System.out.println(i));//odd*/
        
        
        
           
          
           int data = list.stream().mapToInt(Integer::intValue) .sum();
           System.out.println(data); 
           
          
          /* list.stream().UpperCase().forEach(s -> System.out.println(s));
           System.out.println(list); //------ upper case*/
           
  





        

		
	}

}
