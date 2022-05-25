import java.util.*;

public class TestJavaCollection6 {

	public static void main(String[] args) {
		
		// creating deque and adding elements
		
		Deque<String> deque = new ArrayDeque<String>();
		
		deque.add("Ram");
		deque.add("Sita");
		deque.add("Vaishnavi");
		
		// Traversing elements
		
		for(String str : deque)
		{
			System.out.println(str);
		}

	}

}
