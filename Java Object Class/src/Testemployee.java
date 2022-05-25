
class Employee
{
	int id;
	String Name;
	float salary;
	
	void insert(int i, String n , float s)
	{
		id = i;
		Name = n;
		salary = s;
		
	}
	
	void display()
	{
		System.out.println(id+ "" +Name+ "" +salary);
		
	}
}
	

public class Testemployee {

	public static void main(String[] args) {
	
Employee e1 = new Employee();
Employee e2 = new Employee();
Employee e3 = new Employee();

e1.insert(101, "Ram", 50000);
e2.insert(102, "Sita", 60000);
e3.insert(103,  "Krishna", 70000);

	}

}
