import java.util.Scanner;

public class Day7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a no");
		String n = scan.nextLine();
		String sum = "";
		for (int i = n.length()-1; i >= 0; i--) 
		{
			sum = sum+ n.charAt(i);
			
		}
		System.out.println(sum);
	}
}




