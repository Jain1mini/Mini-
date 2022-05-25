import java.util.*;

public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		// creating array list
		
		list.add("Mango");
		list.add("Grapes");
		list.add("Banana");
		list.add("Apple");
		
		// traversing list through for-each loop
		
		for(String fruit:list)
			
		{
			System.out.println(fruit);
		}

	}

}
