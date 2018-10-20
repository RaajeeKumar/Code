package com.threads;

public class ThreadDemo {

	public static void main(String[] args) throws Exception 
	{
		Thread t1 = new Thread(() -> 
		{
			for(int i=0; i<=5; i++)
			{
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		},"Hi Thread");
		Thread t2 = new Thread(() ->
		{		
			for(int i=0; i<=5; i++)
			{
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}			
		},"Hello Thread");
		
		t1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			e.printStackTrace();
		}
		t2.start();
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive());
		
		System.out.println("Bye");
	}		
		
}
	