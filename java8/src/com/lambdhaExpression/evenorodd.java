package com.lambdhaExpression;
 
 interface I6 {
	    void check(int m);}

public class evenorodd {
	public static void main(String[] args) {
		
			I6 eo =(m) -> {
	
				if(m%2==0) 
					System.out.println(m+"even");
				
				else 
					System.out.println(m+"odd");
				};
				eo.check(10);}
}
		
