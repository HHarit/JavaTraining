
package JavaPackage;

import java.util.Scanner;

class person {
	 String  Name;
	 public static int age=9;

	void speak() {
		System.out.println(age);
	}

	int agecalculation(int age) {

		int iage = 65 + age;

		return iage;
	}
}

public class MyJavaFirstClass {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		person objperson = new person();
		objperson.speak();
		Scanner input = new Scanner(System.in);
		int agecal = objperson.agecalculation(input.nextInt());
		System.out.println(agecal);
		
		

		/**
		 * int myint = 20;
		 * 
		 * String text= "Hello";
		 * 
		 * boolean bvalue= 4>5 ? true:false;
		 * 
		 * System.out.println(text + "" + myint + bvalue);
		 * 
		 * while (myint <20) { System.out.println(myint); myint ++; } for(int i=0;i<10;)
		 * { System.out.printf("%d\n",i=i+1); }
		 * 
		 * if(myint>30) System.out.println("Yes it is true "); else {
		 * System.out.println("No it is false "); }
		 * 
		 * Scanner input = new Scanner(System.in);
		 * 
		 * System.out.println("enter a line");
		 * 
		 * 
		 * String example= input.next();
		 * 
		 * switch(example) { case "start": System.out.println("start"); break;
		 * 
		 * case "stop": System.out.println("stop"); break; default:
		 * System.out.println("default");
		 * 
		 * }
		 * 
		 * 
		 * int[] arrayTest = new int[3];
		 * 
		 * arrayTest[0] = 10; arrayTest[1] = 20; arrayTest[2] = 30;
		 * 
		 * for (int i = 0; i < arrayTest.length; i++) {
		 * System.out.println(arrayTest[i]); } int[] Numbers= {2,3,4}; for (int j = 0; j
		 * < Numbers.length; j++) { System.out.println(Numbers[j]); }
		 * 
		 * String[] stringwords = new String[3]; stringwords[0] = "You"; stringwords[1]
		 * = "we"; stringwords[2] = "I";
		 * 
		 * for (String stringword : stringwords) { System.out.println(stringword); }
		 * 
		 * String text = null; System.out.println(text);
		 * 
		 * String[] texts = new String[2]; System.out.println(texts[0]);
		 * 
		 * 
		 * int[] values = {3,5,2345}; System.out.println(values[2]);
		 * 
		 * int[][] grid= { {2,3,34}, {1,2,3}, {4,5,5} };
		 * 
		 * String[][] texts= new String[2][3];
		 * 
		 * texts[0][1]="Hello There";
		 * 
		 * for(int row=0; row<grid.length;row++) { for(int column=0; column<
		 * grid[row].length;column++) { System.out.print(grid[row][column] + "\t"); }
		 * System.out.println(); }
		 */

	}
}
