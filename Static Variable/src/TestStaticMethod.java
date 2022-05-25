class Student
{
	int rollno;
	String name;
	static String college = "ITS";
	
	// static method to change the value of static variable
	static void change()
	{
		college = "BBDIT";
	}
	
	// constructor to initialize the variable
	Student(int r, String n)
	{
		rollno = r;
		name = n;
	}
	
	// method to display values
	void display()
	{
		System.out.println(rollno+ "" +name+ "" +college);
	}
}
	
	// test class to create and display the values of object
	
public class TestStaticMethod {

	public static void main(String[] args) {
	
		
		Student.change(); // calling change method
		// creating objects
		
		Student s1 = new Student(111,"Ram");
		Student s2 = new Student(112, "Sita");
Student s3 = new Student(113, "Vaishnavi");
Student s4 = new Student(114, "Krishna");

// calling display method

s1.display();
s2.display();
s3.display();
s4.display();


	}

}

