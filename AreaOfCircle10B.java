//10B. Java program to find area and circumference of cirlce using static methods.

package Jsd_Assignment01;

public class AreaOfCircle10B {
	
	 public static double area(double radius, double PI) {
			
			return PI * radius * radius;
		}
			
		    public static double circumference(double radius, double PI) {
		    
		        return 2 * PI * radius;
		}
			

	public static void main(String[] args) {
	
		
		AreaOfCircle10B obj = new AreaOfCircle10B();
			
		    System.out.println("Area of circle using static method is : "+obj.area(4, 3.14));
				
		    System.out.println("Circumference of circle using static method is : "+obj.circumference(4, 3.14));
		

	}

}

//Output:
/*
Area of circle using static method is : 50.24
Circumference of circle using static method is : 25.12
*/
