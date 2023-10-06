// 13A.	Initialize 2 variables and find the sum, difference, product, quotient and remainder using static method.

package Jsd_Assignment01;

public class Mathematical_Operations_13B {

	// Using static method.
		public static int add(int a, int b) {

			return a + b;
		}

		// Using static method.
	    public static int diff(int a, int b) {

			return a - b;
		}

	    //Using static method.
	    public static int product(int a, int b) {

		return a * b;

	    }

	    // Using static method.
	    public static int qoutient(int a, int b) {

		return a / b;

	    }

	    // Using static method.
	    public static int remainder(int a, int b) {

		return a % b;

	    }

		public static void main(String[] args) {

			 Mathematical_Operations_13B obj= new Mathematical_Operations_13B();

	        System.out.println("Sum of a + b is : "+obj.add(8, 4));

			System.out.println("Difference of a - b is : "+obj.diff(8, 4));

			System.out.println("Product of a * b is : "+obj.product(8, 4));

			System.out.println("Quotient of a / b is : "+obj.qoutient(8, 4));

			System.out.println("Remainder of a % b is : "+obj.remainder(8, 4));


	}

}

/*
Output:
Sum of a + b is : 12
Difference of a - b is : 4
Product of a * b is : 32
Quotient of a / b is : 2
Remainder of a % b is : 0
*/