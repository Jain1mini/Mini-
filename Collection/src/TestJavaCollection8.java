import java.util.*;

public class TestJavaCollection8 {

	public static void main(String[] args) {
		
		// creating and adding elements
		
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("Ram");
		set.add("Radha");
		set.add("Sita");
		set.add("Krishna");
		
		
		// traversing elements
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext());
		
		{
			System.out.println(itr.next());
			
		}
	}

}
