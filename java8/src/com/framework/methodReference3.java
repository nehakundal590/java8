package com.framework;
interface P{
	public int lengthofString( String s);

	
}
class B{
	public  static int  digitofString(String s1) {
		return s1.length();
		
	}
}
public class methodReference3{
	public static void main(String[] args) {
		P p1=B::digitofString;
		System.out.println(p1.lengthofString("neha"));
	}

}
