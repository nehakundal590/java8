package com.lambdhaExpression;
import java.util.function.Predicate;
interface I4{
	
}

public class predict {
	public static void main(String[] args) {
		Predicate <Integer>p1=i->{if(i%2==0) {return true;} else return false ;};
		System.out.println(p1.test(10));
		
	}

}
