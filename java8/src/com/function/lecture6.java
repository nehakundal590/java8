/*Stream in java 8:-

*****Collection and Stream

*Data storage/Structure.......

1.Collection are mainly used to store and group the data.
Stream are mainly used to perform the operation on the already stored data.

*Collection ---->group of data
*Example:-ArrayList<Integer> list=new ArrayList<>();
*
*a1.add(10);
*a1.add(20);
*Integer-- Wrapper class
******
*Stream:-
*computation or processing
*
*/

package com.function;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

/*Stream ------>DAM 
 * Stream API
 * forEach-------->consumer
 * 
 */


public class lecture6 implements Consumer {
	public void accept(Object i) {
		System.out.println(i);
	}
	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList<>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		
	/*	for(Integer i:a1) {
			System.out.println(i);*/
			
			
			//Consumer<Integer>c=i->System.out.println(i);
		
		Stream<Integer>StreamofNumbers=a1.stream();
		
		Stream<Integer> streamOfNumbers = a1.stream();  // use lowercase 'stream()'
        Consumer<Integer> c = i -> System.out.println(i);
          streamOfNumbers.forEach(c);
		
		}
	}


