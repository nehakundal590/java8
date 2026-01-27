package com.function;
// interface,abstract,concrete class
//Functional interface---->lambda expression ------>Anonymous function
//Single abstract method

//functional interface------runnable, clonable, callable
//interface I{
	/*void m1(); //------public abstract
	default void m3() {
		System.out.println("m3 method inside the A");
	}
	static void m4() {
		System.out.println("m4 method inside the A");
	}
}
	class A1 implements I{
		public void m1() {
			System.out.println("m1 meyhod inside the class a ");
		}
	}
public class lecture2 {
	public static void main(String[] args) {
		String s;
	}
}*/

//------------------------------------ without lambda expression

/*interface A{
	 void m1() ;
	
}
public class neha implements A{
	public void m1() {
		System.out.println( " m1 method inside the I");
	}
	public static void main(String[]args) {
     A obj=new neha();
obj.m1();
}
}*/
//-----------------------------with lambda expression
  /*interface I{
	void m11();
	
}
public class neha1 implements I{
	public void m11() {
		System.out.println("m1 method inside the class neha");
	}
	public static void main(String []args) {
		I obj1=new neha1();
		obj1.m11();
	}
}*/
//-------------------------------Example without lambda expression

/*interface I{
	void m1(int a,int b);
	
}
public class rohan implements I{
	public void m1(int a, int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		I obj =new rohan();
		obj.m1(10,20);
		
	}
}*/
//----------------------------Example add two number with lambda expression
interface I{
	public abstract void m1(int a,int b);
}
public class lecture2{
	public static void main(String[] args) {
	I obj=	( a, b)->System.out.println(a+b);
    obj.m1(10,20);
	
	
	}
}
	

