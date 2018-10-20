package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		List<Integer> values1 = Arrays.asList(18,20,34,45,59,60);
		/*int result=0;
		for(int i : values){
			result = result+i*2;
		}
		System.out.println(result);*/
		
		//System.out.println(values.stream().map(i -> i*2).reduce(0,(i,j) -> i+j));
		
		System.out.println(values.stream().map(i -> i*2).reduce(0,Integer::sum));
		
		System.out.println(values1.stream().filter(i->i%5==0).reduce(0,Integer::sum));
		
		System.out.println(values1.stream().filter(i->i%5==0).map(i->i*2).findFirst().orElse(0));

	}

}
