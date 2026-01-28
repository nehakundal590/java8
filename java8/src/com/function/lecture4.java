
package com.function;

import java.util.function.Predicate;
public class lecture4 {

public static void checkPredicate(Predicate<Integer>p,int[]arr) {
	for(int i=0;i<arr.length;i++) {
		if(p.test(arr[i])) {
			System.out.println(arr[i]+"");
		}
	}
	System.out.println();
}


	public static void main(String[] args) {
		int number[]= {10,20,20,-20,-10,40,50,45,100,21,110};
		Predicate<Integer>p1=i->(i<50);
		Predicate<Integer>p2=i->i%2==0;
		
		//Predicate<Integer>p3=i->i%2!=0;
		//Predicate<Integer>p4=i->i%5==0; //divisible by 5



Predicate<Integer>oddNumber=p2.negate();

//	System.out.println(odd Number);
//checkPredicate(oddNumber,number);



Predicate<Integer>greterThanFifty=p1.negate();

checkPredicate(greterThanFifty,number);
		
	}

}
//Predicate joining
/*1.Display Even Number
* Display even number must be lesser than or greater than 50.
* 
* intwerface Predicate<Integer>{
* 1.test();  // abstract //SAM
* 2. default methods AND , OR ,Negate
* 3.static method isEqual
*/