package com.builder;

public class Phone {
	
	private String os;
	private int ram;
	private String processor;

	public Phone(String os, int ram, String processor) {
		super();
		this.os = os;
		this.ram = ram;
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", ram=" + ram + ", processor=" + processor
				+ "]";
	}

}
