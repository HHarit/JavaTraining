package abstraction;

public class rectangle extends Shape{

	@Override
	void area(int x ,int y) {
		System.out.println(x*y);
		
	}
	void printdata()
	{
		System.out.println("Rectangle");
	}

}
