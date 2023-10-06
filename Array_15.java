//15. Java program to initialize integer, character & string array.

package Jsd_Assignment01;

public class Array_15 {

	public static void main(String[] args) {
		         // Initializing integer array.
				int[] n = {1,2,3,4,5};

				// Initializing String array.
				String[] str = {"Pavan"};

				// Initializing Character array.
				char[] c = {'P','A','V','A','N'};

				System.out.println("Integer Array Initialization : ");

				// Using for each loop.
				for(int n1 : n) {

					System.out.println(n1);
				}

				System.out.println("String Array Initialization : ");

				// Using for each loop.
				for(String str1 : str) {

					System.out.println(str1);
				}

				System.out.println("Character Array Initialization : ");

				// Using for each loop.
				for(int i = 0; i<c.length; i++) {

					System.out.println(c[i]);
				}


	}

}

/*
Output:
Integer Array Initialization : 
1
2
3
4
5
String Array Initialization : 
Pavan
Character Array Initialization : 
P
A
V
A
N
*/
