class myRunable implements Runnable
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
}



public class ThreadTest {

	public static void main(String[] args) {
		
		MyThread t = new ThreadTest();
		Thread th = new Thread(t);
		th.start();
		int i = 1;
		
		while(true)
		{
			System.out.println(i+ "world");
			i++;
			
			
			
		}

	}

}
