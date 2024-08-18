import java.util.Scanner;

/**
 * PizzaShares class demonstrates division and remainder operators 
 * @author First Last
 */
public class PizzaShares {
	
	public static void main(String[] args) {
		//Declare local variables
		int people, totalSlices, slicesPerPerson, slicesRemaining;
		
		//Declare and initialize Scanner to read user input
		Scanner input = new Scanner(System.in);    
		
		//Prompt for number of people and slices of pizza
		System.out.print("Enter #people and #slices: ");
		people = input.nextInt();
		totalSlices = input.nextInt();
		
		//Compute number of slices per person
		slicesPerPerson = totalSlices / people;
		
		System.out.println("Each person gets " + slicesPerPerson + " slices.");
		
		//TODO: Compute number of slices remaining
		slicesRemaining = totalSlices % people;
		System.out.println("There are " + slicesRemaining + " slices remaining.");
	}
	
	

}
