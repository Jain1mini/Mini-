
abstract class Bank
{
	abstract int getRateOFInterest();
		
	}
class SBI extends Bank
{
	int getRateOFInterest()
	{
		return 7;
	}
}

class PNB extends Bank
{
	int getRateOFInterest()
	{
		return 8;
	}
}

public class TestBank {

	public static void main(String[] args) {
	
		Bank b;
		b = new SBI();
		System.out.println("Rate of Interest is: "+b.getRateOFInterest()+ "%");
		
		b = new PNB();
		System.out.println("RateOFInterest is: "+b.getRateOFInterest()+ "%");
		

	}

}
