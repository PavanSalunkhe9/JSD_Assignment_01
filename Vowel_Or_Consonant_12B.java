//12B. Java program to check vowel or consonant  using static methods.

package Jsd_Assignment01;

public class Vowel_Or_Consonant_12B {

	     // Using static method.
		public static String Isvowel(char ch) {

	    // Using if-else statement		
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' 
					|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

					return ch+" Character is vowel";
			}
			else {
					return ch+" Character is consonant";
			}

		}


		public static void main(String[] args) {

			Vowel_Or_Consonant_12B  vc = new Vowel_Or_Consonant_12B();


			System.out.println(vc.Isvowel('i'));
	}

}
