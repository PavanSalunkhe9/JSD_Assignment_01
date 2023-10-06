//6. Java program to check students result 'PASS' or 'FAIL'.

package Jsd_Assignment01;

import java.util.Scanner;

public class PassOrFail06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the mark:");
	        int mark = sc.nextInt();

	        if (mark >= 50) {
	            System.out.println("PASS");
	        } else {
	            System.out.println("FAIL");
	        }
	    }
	

}


