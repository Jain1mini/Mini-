import java.util.*;
class Day8
{
	public static void main(String args[])
	{
		
		ArrayList<String>list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Kiran");
		list.add("Ravi");
		list.add("Kiran");
		
		
		// traversing the array list
		Iterator itr = list.iterator();
		while(itr.hasNext());
		{
			
		System.out.println(itr.next());
		
	}			
	}
}