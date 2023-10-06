//8.  Java program to find even numbers between 1 to 10 numbers using for, while & do while loop.

package Jsd_Assignment01;

public class EvenNumber08 {

	public static void main(String[] args) {
	
        //using for loop
		
		System.out.println("Even Numbers using for loop:");
		for(int i = 0; i <= 10; i++) {
				
		if(i % 2 == 0) {
					
		System.out.println(i);
		}
	}
		System.out.println("Even numbers using while loop:");
		int i = 1;
		while (i <= 10) 
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;	
		}

		System.out.println("Even numbers using do_while loop:");
		i=1;
		do
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
		while(i <= 10);
	    }
	 }
  
/*
Output:
Even Numbers using for loop:
0
2
4
6
8
10
Even numbers using while loop:
2
4
6
8
10
Even numbers using do_while loop:
2
4
6
8
10
*/
