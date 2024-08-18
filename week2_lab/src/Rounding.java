import java.util.Scanner;

/**
 * Rounding class demonstrates numeric conversion and rounding.
 * (1) Round a number to nearest integer
 * (2) Truncate a number to 3 digits after the decimal point
 * (3) TODO: Round a number to 3 digits after the decimal point
 * @author First Last
 */

public class Rounding {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number: " );
		double num = input.nextDouble();

		System.out.println("Round to nearest int");
		System.out.println("Original: \t"  	+ num);                  
		System.out.println("Add 0.5:\t" 	+ (num + 0.5));           
		System.out.println("Cast as int:\t" + (int) (num + 0.5));   
		System.out.println();

		System.out.println("Truncate to 3 digits after the decimal point");
		System.out.println("Original:\t\t"      		+ num);                         
		System.out.println("Move . 3 digits right:\t" 	+ num * 1000 );          
		System.out.println("Cast as int\t\t"        	+ (int) (num * 1000));        
		System.out.println("Move . 3 digits left:\t"  	+ (int) (num * 1000 ) / 1000.0); 
		System.out.println();


		System.out.println("TODO: Round to 3 digits after the decimal point");
		System.out.println("Original:\t\t"      		+ num);                         
		System.out.println("Move . 3 digits right:\t" 	+ (num * 1000) );          
		System.out.println("Add 0.5:\t\t" 				+ (num * 1000 + 0.5) );          
		System.out.println("Cast as int\t\t"        	+ (int) (num * 1000 + 0.5));        
		System.out.println("Move . 3 digits left:\t"  	+ (int) (num * 1000 + 0.5 ) / 1000.0); 
	}

}
