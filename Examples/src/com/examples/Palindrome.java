package com.examples;

public class Palindrome {

	public static void main(String[] args) {
		int i, sum =0;
		int r;
		int n = 321;
		int temp = n;
		
		while(n>0)
		{
			r = n%10;
			sum = sum*10 + r;
			n = n/10;
		}
		
		if(sum == temp)
			System.out.println("Number is a palindrome");
		else
			System.out.println("Number is not a palindrome");
		
		

	}

}
