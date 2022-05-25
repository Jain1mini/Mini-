import java.util.*;

public class TestJavaCollection4 {

	public static void main(String[] args) {
	
		Stack<String> stack = new Stack<String>();
		
		stack.push("Ram");
		stack.push("Sita");
		stack.push("Vaishnavi");
		stack.push("Krishna");
		stack.push("Shiv");
		
		stack.pop();
		
		Iterator<String> itr = stack.iterator();
		while(itr.hasNext());
		
		{
			System.out.println(itr.next());
		}
		
	}

}
