package com.consumer;

import java.util.function.Consumer;

class PrintString implements Consumer<String>{
	public void accept(String s) {
		System.out.println(s);
	}
}

public class Consumer1 {
	public static void main(String[] args) {
		Consumer<String>c=new PrintString();
		c.accept("neha");
		
		// with lambda expression
		Consumer<String>p=s->System.out.println(s);
		p.accept("neha");
	}

}
