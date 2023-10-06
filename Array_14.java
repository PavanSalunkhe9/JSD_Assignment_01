//14. Java program to store integers in array and reverse it.

package Jsd_Assignment01;

public class Array_14 {

	public static void main(String[] args) {
		int[] numbers = new int[5];

        // Store 5 integers in the array
        numbers[0] = 7;
        numbers[1] = 8;
        numbers[2] = 9;
        numbers[3] = 10;
        numbers[4] = 11;

        // Print the array in reverse order
        System.out.println("Array in reverse order :");
        
        for (int i = numbers.length - 1; i >= 0; i--) 
        {
            System.out.println(numbers[i]);
        }

	}

}

/*
Output:
Array in reverse order :
11
10
9
8
7
*/
