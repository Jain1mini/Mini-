import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		// creating array list
		
		list.add("Grapes");
		list.add("Banana");
		list.add("Apple");
		list.add("Mango");
		
		// printing the array list object
		
		System.out.println(list);
		
		for(String ls:list){
			System.out.println(ls);
		}
		
			
		
	}

}
