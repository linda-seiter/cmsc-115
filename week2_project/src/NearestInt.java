import java.util.Scanner;

/**
 * Nearest class demonstrates numeric conversion, casting and rounding.
 * @author First Last
 */
public class NearestInt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter numerator and denominator: ");
		int numerator = input.nextInt();
		int denominator = input.nextInt();
		double number = 1.0*numerator/denominator;
		int nearestInt = (int)(number + 0.5);
		System.out.println("Fraction: " + numerator+"/"+denominator);
		System.out.println("Double Value: " + number);
		System.out.println("Cast as Int: " + (int)number );
		System.out.println("Rounded to nearest int: " + nearestInt);
		double negNumber = -number;
		int nearestNegInt = (int)(negNumber - 0.5);
		System.out.println("Negative Value: " + negNumber);
		System.out.println("Negative Value rounded to nearest int: " + nearestNegInt);	
	}
}
