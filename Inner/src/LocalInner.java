import java.util.*;

abstract class My
{
	abstract public void show();
}
class Outer
{
	public void display()
	{
		class Inner
		{
			public void show()
			{
				My m = new My() 
				{ 
					public void show() 
				{
					System.out.println("hello"); 
			}
				}
				m.show();
			}
		}
		Inner i = new Inner();
		i.show();
	}
}
public class LocalInner {

	public static void main(String[] args) {
	
		Outer o = new Outer();
		o.display();

	}

}
