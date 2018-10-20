package com.lambda;


interface A
{
	void show();
}

// Case 1
/*class XYZ implements A 
{
	public void show()
	{
		System.out.println("hello");
	}
}*/

public class LambdaDemo 
{
	

	public static void main(String[] args) 
	{
		A obj;
		
		// CASE 1
		/*obj = new XYZ();
		obj.show();*/
		
		// CASE 2 - Anonymous Inner class
		/*obj = new A()
			{
				public void show()
				{
				System.out.println("hello");
				}
			};
		obj.show();*/
		
		// CASE 3
		obj = ()->System.out.println("hello");
		obj.show();
	}

	

}
