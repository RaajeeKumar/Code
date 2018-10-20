package com.builder;

public class Shop {

	public static void main(String[] args) {
		Phone p = new PhoneBuilder().setOs("IOS").setRam(2).getPhone();
		
		System.out.println(p);

	}

}
