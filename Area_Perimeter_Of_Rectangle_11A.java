//11A. Java program to find area and perimeter of rectangle without using methods.

package Jsd_Assignment01;

public class Area_Perimeter_Of_Rectangle_11A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int length = 7;

		int breadth = 4;

		int perimeter, area;

		// Formula to find area of rectangle.
		area = length * breadth;

		// Formula to find perimeter of rectangle.
		perimeter = 2 * length + breadth;


		System.out.println("Area of rectangle without using method is : "+area);

		System.out.println("Perimeter of rectangle without using method is : "+perimeter);

	}

}

/*
Output:
Area of rectangle without using method is : 28
Perimeter of rectangle without using method is : 18
*/
