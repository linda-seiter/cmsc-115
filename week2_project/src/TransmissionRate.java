import java.util.Scanner;

/**
 * TransmissionRate class demonstrates use of Math.pow and casting
 * to calculate viral spread based on user input for R0.
 * @author First Last
 */
public class TransmissionRate {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter r0: ") ;
		int r0 = input.nextInt();
		int spread = (int)Math.pow(r0, 4);
		System.out.println("New cases on 4th iteration: " + spread);
	}

}
