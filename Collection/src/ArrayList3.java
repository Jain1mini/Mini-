import java.util.*;

public class ArrayList3 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Grapes");
		al.add("Mango");
		al.add("Banana");
		al.add("Apple");
		
		// accessing the element
		
		System.out.println("Returning element:" +al.get(3));
		
		// it will return the second element, because index starts from 0
		// changing the element
		
		al.set(1,"Dates");
		// traversing list
		
		for(String fruit:al)
		{
			System.out.println(fruit);
		}
		
	}

}
