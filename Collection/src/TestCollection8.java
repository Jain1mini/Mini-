import java.util.*;

public class TestCollection8 {

	public static void main(String[] args) {
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		set.add("Ram");
		set.add("Sita");
		set.add("Vaishnavi");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext());
		{
			System.out.println(itr.next());
		}
		

	}

}
