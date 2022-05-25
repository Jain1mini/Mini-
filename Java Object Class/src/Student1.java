
// java program to demonstrate having the main method in
// another class
// creating Student1 class

public class Student1 {

	int id;
	String name;

}

// creating another class TestStudent which contains the main method 
 
 class TestStudent
 {
	 
	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println(s1.id);
		System.out.println(s1.name);
	}

}
