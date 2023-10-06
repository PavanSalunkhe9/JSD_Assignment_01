//7. Java program to perform mathematical operations using switch statement.

package Jsd_Assignment01;

import java.util.Scanner;

public class MathOperation07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 7;
		int num2 = 3;
			
		System.out.println("Enter the Operators to perform Operations := ");
		
		Scanner sc = new Scanner(System.in);
		char sum = sc.next().charAt(0);
			
		switch(sum) {
			
			case '+':
				System.out.println("Sum of "+num1+" + "+num2+" is : "+(num1 + num2));
				break;
				
			case '-':
				System.out.println("Difference of "+num1+" - "+num2+" is : "+(num1 - num2));
			    break;
				
			case '*':
				System.out.println("Product of "+num1+" * "+num2+" is : "+(num1 * num2));
				break;
				
			case '/':
				System.out.println("Quotient of "+num1+" / "+num2+" is : "+(num1 / num2));
				break;
				
	                default:
		    	System.out.println("Invalid Operation");
				
			}
		}

	}

/* 
 * Output:
 * Enter the Operators to perform Operations := 

-
Difference of 7 - 3 is : 4
 */

