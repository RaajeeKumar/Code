package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoClass {

	public static void main(String[] args) {
		List<Integer> values = new ArrayList<>();
		values.add(13);
		values.add(40);
		values.add(51);
		
		
		Comparator<Integer> com = new ComparatorImpl();
		Collections.sort(values, com);
		
		/*Iterator iter = values.iterator();
		
		for(int i= 0; i<values.size();i++){
			System.out.println(iter.next());
		}*/
		
		for(int i : values){
			System.out.println(i);
		}
		
		//values.forEach(System.out::println);
	
	}

}
