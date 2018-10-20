package com.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//CASE 1
/*class ConsImpl implements Consumer<Integer>
{
	public void accept(Integer i)
	{
		System.out.println(i);
	}
}*/

public class DemoConsumerInterface {

	public static void main(String[] args) {
		
		Consumer<Integer> c;
		
		// CASE 1
		/*List<Integer> values = Arrays.asList(4,5,6,7,8);
		c = new ConsImpl();
		values.forEach(c);*/
		
		// CASE 2
		/*List<Integer> values = Arrays.asList(4,5,6,7,8);
		c = new Consumer<Integer>()
				{
				public void accept(Integer i)
				{
					System.out.println(i);
				}
				};
		values.forEach(c);*/
		
		List<Integer> values = Arrays.asList(4,5,6,7,8);
		//c =  i ->System.out.println(i);				
		values.forEach(i ->System.out.println(i));
		values.parallelStream().forEach(i -> System.out.println(i));
		
		

	}

}
