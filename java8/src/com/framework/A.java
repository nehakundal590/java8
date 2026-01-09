package com.framework;
import java.util.*;
class Hello{
	
}
public class A {
	public static void main(String[] args) {
		// 1.collection of Elements
		Vector v=new Vector();  //legacy classes
		v.addElement("neha");
		v.addElement(12345);
		v.addElement(new Hello());
		v.addElement(12345);
		System.out.println(v); //tostring()
		
		Enumeration enm=v.elements();
		while(enm.hasMoreElements())
		{
			Object o=enm.nextElement();
			System.out.println(o);
		}
		//2.collection key of value pairs
		Properties p=new Properties();
		p.put("Name", "Email");
		p.put("neha", "neha@345");
		p.put("neha", "neha@234");
		System.out.println(p);
	}

}
