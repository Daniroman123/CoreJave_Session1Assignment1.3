/*Write a program that swaps the values of two variables without using third variable.*/
public class Swap {

	public static void main(String[] args) {
		 int x = 10;
	        int y = 20;
	        System.out.println("the value of x is " + x); // Display the value of x before swapping
	        System.out.println("the value of y is " + y); // Display the value of y before swapping
	        x = x+y; // update x as the sum of both variables
	        y=x-y; // subtract y from the sum will leave value of x 
	        x=x-y; // subtract y which was originally x will leave value of original y 
	        System.out.println("After swapping, ");
	        System.out.println("The new value of x is " +x); // Result of x
	        System.out.println("The new value of y is " +y); // result of y

	}

}
