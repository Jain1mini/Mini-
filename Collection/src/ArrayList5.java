import java.util.*;  
 public class ArrayList5{  

	public static void main(String args[]){  
    
		ArrayList<String> list = new ArrayList<String>(); // creating array list
		list.add("Ram");
		list.add("Sita");
		list.add("Vaishnavi");
		list.add("Krishna");
		
		System.out.println("traversing list through list iterator:");
	// here elements iterates in reverse order 
		ListIterator<String> list1 = list.listIterator(list.size());
		while(list1.hasPrevious());
	
		{
			String str = list1.previous();
			System.out.println(str);
		}
		
		System.out.println("traversing list through for each loop:");
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		
		System.out.println("traversing list through for Each() method:");
		
		// the for Each() method is a new feature
		list.forEach(a-> //here we are using lambda expression
		{
			System.out.println(a);
		});
		
		System.out.println("traversing list through for EachRemaining() method:");
		Iterator<String> itr =list.iterator();
		itr.forEachRemaining(a-> // here we are using lambda expression
		{
			System.out.println(a);
		});
		}
		}
		
	  
 