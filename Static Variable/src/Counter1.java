// java program to illustrate the use of static variable which
// is shared with all subjects

public class Counter1 {
	static int count = 0; // will get memory only once and retain its value
	
	
	Counter1()
	{
		count++;
		// incrementing the value of static variable
		System.out.println(count);
	}
	
	
		public static void main(String[] args) {
		// creating objects
			
			Counter1 c1 = new Counter1();
			Counter1 c2 = new Counter1();
			Counter1 c3 = new Counter1();

	}

}
