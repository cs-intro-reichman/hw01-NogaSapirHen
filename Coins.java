/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		// Put your code here
		
        // Declares the number of coins
	int a = Integer.parseInt (args[0]);
		// examination if there are any quarters
		if ( a < 25 )
			System.out.println( "use " + a + " cents");
		// 1 quarter option
		else if ( a / 25 == 1 )
			// no cents
			if ( a % 25 == 0 )
				System.out.println( "use 1 quarter");
			else
			System.out.println( "use 1 quarter and " + a + " cents" );
		// any other option
		else 
		{
		int quarters = a / 25;
		int cents = a % 25;
		System.out.println( "use " + quarters + " quarters and " + cents + " cents" );
		}
    }
}