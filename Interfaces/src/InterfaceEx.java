import java.util.*;

class Phone
{
	public void call()
	{
		System.out.println("phone call");
	}
	
	public void sms()
	{
		System.out.println("phone sending sms");
	}
	
	interface ICamera
	{
		void click();
		void record();
	}
	
	
	interface IMusicPlayer
	{
		void play();
		void stop();
	}
	
	SmartPhone extends Phone implements ICamera, IMusicPlayer
	{
		public void VideoCall()
		{
			System.out.println("Smart phone video calling");
		}
		
		public void Click()
		{
			System.out.println("Smart phone video click");
		}
		
		
		public void Record()
		{
			System.out.println("Smart phone video recordk");
		}
		
		
		public void Play()
		{
			System.out.println("Smart phone video play");
		}
		
		
	}

}
public class InterfaceEx {

	public static void main(String[] args) {
		
		IMusicPlayer sp = new SmartPhone();
		sp.call();
		sp.click();
		sp.record();
		
		
	}			
				

	}

