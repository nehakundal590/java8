package com.lambdhaExpression;
//Java 8 Functional Interface and Lambda Expression
//Functional Interface--->Runnable,Predicate,Consumer,Callable
//Marker Interface--_> Clone able,Serializable marker
//Lambda Expression
 interface I{
	void show ();
	
}
public class Demo {
	
		public static void main(String[] args) {
		I i1=()->System.out.println("Show method...");
		i1.show();
		
		}

}
