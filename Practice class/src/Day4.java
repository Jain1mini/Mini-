
public class Day4 {

	public static void main(String[] args) {
		
		String str[] = { "Ram Kumar","Krishna Singh", "Sita Gupta", "Radha Maurya", 
				"Rohit Singh", "Mika Sharma", "Pankaj Sharma"};
		
		String surName = "Sharma";
		int surNameSize = surName.length();
		
		
		int size = str.length;
		for(int j=0; j<size; j++)
		{
			int length = str[j].length();
			// extracting the surname
			
			String subStr = str[j].substring(length-surNameSize);
			
			
			// check whether the surname is equal to "Singh" or not
			
			if(subStr.equals(surName))
			{
				System.out.println(str[j]);
				
			}
		}
	}

}


