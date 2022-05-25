import java.util.*;

public class TestJavaCollection3 {

	public static void main(String[] args) {

		Vector<String> v = new Vector <String>();
		
		v.add("Ayush");
		v.add("Ati");
		v.add("Rishabh");
		v.add("Preksha");
		
		Iterator<String> itr = v.iterator();
		
		while(itr.hasNext());
		{
			System.out.println(itr.next());
		}
	}

}
