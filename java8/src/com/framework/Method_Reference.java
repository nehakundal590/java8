package com.framework;
interface Ii{
	public boolean checkSingledigit(int x);
		
	}
	 class digit{
		public  static boolean  isCheckSingleDigit(int y) {
			return y>-10&&y<10;
	}
}

public class Method_Reference {
	public static void main(String[] args) {
		Ii ii=digit::isCheckSingleDigit;
		System.out.println(ii.checkSingledigit(0));
		
		
	}

}
