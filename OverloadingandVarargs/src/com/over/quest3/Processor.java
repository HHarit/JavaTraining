package com.over.quest3;

public class Processor {
	double z;
	void calculate(double x) {
		z=x*x;
		 System.out.println("squareroot" + z );
	} 

	void calculate(int x, int y) {
		z=x*y;
		System.out.println("product" + z );
	} 

	void calculate(double x, double y) {
		 z= x-y;
		 System.out.println("Difference" + z );
	} 


	void calculate(double x, int y)
	{
		 z= Math.pow(x, y);
		 System.out.println("Power" + z );
	}

}
