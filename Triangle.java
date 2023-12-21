/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		// Put your code here	
		        // Declares the triangle lengthes
	  int a = Integer.parseInt (args[0]);
      int b = Integer.parseInt (args[1]);
	  int c = Integer.parseInt (args[2]);
	  // the boolean gives answer to the question whether or not is this a triangle
	  boolean triangle = false ;
	  // prints the program's name and numbers
	  System.out.println( "java Triangle "+ a +" "+ b +" "+ c);
	  // checks all three options
	 triangle = ( ( a + b > c ) && ( a + c > b ) && ( b + c > a ) );
	  System.out.println( a + ", " + b + ", " + c +" " + triangle );

	}
}
