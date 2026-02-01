package com.function;
//Anonymous inner class
interface Car{
	void drive();
}
	
/*class scropyo implements Car{
	public void drive() {
		System.out.println("dreive...");
	}
}*/

public class ClassAnony {
	
	public static void main(String[] args) {
		//scropyo s=new scropyo();
		//s.drive();
		Car c=new Car() {
			public void drive() {
				System.out.println("drive...");
			}
		};
		Car c1=()->System.out.println("drive");
		c1.drive();
	}
}

			
		
		


