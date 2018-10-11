package com.examples;

public class NumberSwap {

	public static void main(String[] args) {
		// Number swap using temporary variable
		
		int i = 3;
		int j = 5;
		int t = 0;
		
		t = i;
		i = j;
		j = t;
		
		System.out.println(i);
		System.out.println(j);
		
		// Number swap without a temporary variable
		
		int a = 13;
		int b = 15;
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println(a);
		System.out.println(b);

	}

}
