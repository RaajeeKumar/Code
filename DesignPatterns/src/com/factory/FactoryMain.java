package com.factory;

public class FactoryMain {

	public static void main(String[] args) {
		OperatingSystemFactory osf = new OperatingSystemFactory();
		Os os = osf.getInstance("Android");
		os.spec();
	}

}
