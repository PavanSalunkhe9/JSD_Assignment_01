//9. Java program to find odd numbers between 1 to 10 using for, while & do while loop.

package Jsd_Assignment01;

public class OddNumber09 {

	public static void main(String[] args) {
		
		System.out.println("Odd numbers using for loop:");
		for (int i = 1; i <= 10; i++) 
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}

		System.out.println("Odd numbers using while loop:");
		int i = 1;
		while (i <= 10) 
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
			i++;	
		}

		System.out.println("Odd numbers using do_while loop:");
		i=1;
		do
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
			i++;
		}
		while(i <= 10);
	}
}


//Output:
/*
Odd numbers using for loop:
1
3
5
7
9
Odd numbers using while loop:
1
3
5
7
9
Odd numbers using do_while loop:
1
3
5
7
9
*/