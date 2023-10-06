//11B. Java program to find area and perimeter of rectangle without using static methods.

package Jsd_Assignment01;

public class Area_Perimeter_Of_Rectangle_11B {
	// Using parameterized static method.
		public static int area(int length, int breadth) {

			// Formula to find area of rectangle.
			return length * breadth;
		}

		      // Using parameterized static method.
		public static int perimeter(int length, int breadth) {

			   // Formula to find perimeter of rectangle.
			return 2 * length + breadth;
		}

	   public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area_Perimeter_Of_Rectangle_11B obj = new Area_Perimeter_Of_Rectangle_11B();
		
		System.out.println("Area of rectangle using static method is : "+obj.area(7,4));

		System.out.println("Perimeter of rectangle using static method is : "+obj.perimeter(7,4));


	}

}

/*
Output :
Area of rectangle using static method is : 28
Perimeter of rectangle using static method is : 18
*/
