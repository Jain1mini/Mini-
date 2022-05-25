import java.io.*;
public class Test1 extends Thread
{
	
	public void run()
	{
		int i =1;
		while(true)
		{
			System.out.println(i+ "hello");
			i++;
		}
	}
	

	
	public static void main(String[] args) {
		class Test1 t = new Test();
		T.start();
		int i =1;
		while(true)
		{
			System.out.println(i+ "world");
			i++;
		}
		

	}

}
