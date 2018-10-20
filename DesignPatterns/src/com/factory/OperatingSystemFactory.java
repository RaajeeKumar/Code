package com.factory;

public class OperatingSystemFactory {
	
	public Os getInstance(String str)
	{
		if("Apple".equals(str))
			return new IOS();
		else if("Android".equals(str))
			return new Android();
		else
			return new Windows();
	}

}
