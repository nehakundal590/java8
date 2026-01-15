package com.framework;




interface I{
	public int add(int a,int b);
}
class G{
	public static int sum(int a,int b) {
		return a+b;
	}
}

public class MethodReference2 {
	public static void main(String[] args) {
		I i=G::sum;
		System.out.println(i.add(10, 10));
	}

}

