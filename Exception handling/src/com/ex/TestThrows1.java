package com.ex;

public class TestThrows1 {
	
	void m()throws1 IOException
	{
		throw new IOException("device error"); // checked exception
		
	}
	
	void n()throws1 IOException
	{
		m();
		
	}
	
	void p()
	{
		try
		{
			n();
		}
		
		catch(Exception e)
		{
			System.out.println("exception handled");
			
		}
	}

	public static void main(String[] args) {
	TestThrows1 obj = new TestThrows1();
	
	obj.p();
	System.out.println("normal flow.......");
	}

}
