
public class Day2 {

	public static void main(String[] args) {
		
		try
		{
			int a[] = new int[7];
			a[4] = 30/0;
			System.out.println("First print in try block");
		}
		
		catch(ArithmeticException e)
		{
			
			System.out.println("warning.....");		
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		
		{
			System.out.println("cautions......");
		}
		
		catch(Exception e)
		{
			System.out.println("alert......");
		}
		{
		System.out.println("out block");
		}
	}

}
