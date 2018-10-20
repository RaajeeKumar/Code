package com.lambda;

import java.util.Arrays;
import java.util.List;

public class DemoForEach {

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(4,5,6,7,8);
		
		// External Loops - Takes more time
		
		/*for(int i=0;i<values.size();i++)
		{
			System.out.println(values.get(i));
		}
		
		for(int i:values)
		{
			System.out.println(i);
		}*/
		
		// Internal Loops
		
		values.forEach(i -> System.out.println(i));// Lambda Expression
		
		//i -> System.out.println(i) This line is the implementation of Consumer Interface
			
		

	}

}
