
public class Day1 {

	public static void main(String[] args) {
		
		int num1, num2;
		try {
			num1 =0; 
					num2 = 62/num1;
System.out.println(num2);
System.out.println("End of try block");
		}
		
		

catch(ArithmeticException e)
{
	System.out.println("no. shouldn't divide by zero");
}

catch(Exception e)
{
	System.out.println("Exception occured");
}
		
		System.out.println("out in try and catch of block");
}
			
		}