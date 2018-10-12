package com.examples;

public class StringReverse {

	public static void main(String[] args) {
		String str = "Raajee";
		
		String str1 = reverse(str);
		
		System.out.println(str1);
		
		

	}
	
	public static String reverse(String str){
		if(str == null || str.isEmpty()){
			return str;
		}
		String reverseString = "";
		for (int i=str.length()-1;i>=0; i--){
		reverseString = reverseString + str.charAt(i);	
		}
		return reverseString;
		}

}
