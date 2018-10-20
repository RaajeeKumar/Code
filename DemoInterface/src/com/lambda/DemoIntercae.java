package com.lambda;

interface Phone
{
	void call();
	default void message()
	{
		System.out.println("sent");
	}
	static void browse()
	{
		System.out.println("browse");
	}
}

class AndroidPhone implements Phone 
{
	public void call()
	{
		System.out.println("calling");
	}
}

public class DemoIntercae {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone p = new AndroidPhone();
		p.call();
		p.message();
		Phone.browse();

	}

}
