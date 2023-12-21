/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		// Put your code here
// declares the range, assuming the first number is lower
	int min = Integer.parseInt (args[0]);
	int max = Integer.parseInt (args[1]); 
	// generates three numbers (may be equal to the low number of the range)
	int a = (int) (Math.random() * ( max - min ) + ( min ) );
	int b = (int) (Math.random() * ( max - min ) + ( min ) );
	int c = (int) (Math.random() * ( max - min ) + ( min ) );
	// prints the generated numbers
	System.out.println (a);
	System.out.println (b);
	System.out.println (c);
	// 2 different options fo the minimal number
	int minimal = Math.min (a,b);
	minimal = Math.min (minimal,c);
	System.out.println ("The minimal generated number was " + minimal );		
	}
}
