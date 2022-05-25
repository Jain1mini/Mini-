import java.util.*;
public class ArrayList7 {

	public static void main(String[] args) {
	
		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println("initial list of elements: "+al);
		
		// adding elements to the end of the list 
		al.add("Ravi");
		al.add("Shyam");
		al.add("Raghav");
		
		System.out.println("after invoking add(E e)method: +al");
		// adding an element at specific position
		al.add(1, "Gaurav");
		
		System.out.println("after invoking add(int index, E element)method: "+al);
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Sonoo");
		al2.add("Hanumat");
		
		// adding second list elements to the first list
		
		al.addAll(al2);
		System.out.println("after invoking addAll(collection<? extends E> c)method:" +al);
		ArrayList<String> al3 = new ArrayList<String>();
		
		al3.add("John");
		al3.add("Rahul");
		
		// adding second list elements to the first list at specific position 
		
		al.addAll(1, al3);
		
		System.out.println("after invoking addAll(intindex, Collection <? extends E> c)method: "+al);
		

	}

}
