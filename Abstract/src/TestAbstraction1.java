
abstract class Shape
{
	abstract void draw();
}

// in real scenario, implementation is provided by others 1.e, unknown by end user
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("drawing rectangle......");
	}
}

class Circle1 extends Shape
{
	void draw()
	{
		System.out.println("drawing circle.......");
	}
}

// in real scenario, method is called by programmer or user

public class TestAbstraction1 {
	
	

	public static void main(String[] args) {
		
		Shape s = new Rectangle();
		// in a real scenario, object is provided through method, e.g., get shape() method
		s.draw();

	}

}
