import java.util.Scanner;

/**
 * SeafoodMarket class demonstrates user I/O
 * along with rounding a value to 2 digits after decimal point. 
 * @author First Last
 */

public class SeafoodMarket {
	
	public static void main(String[] args) {
		//Declare and initialize Scanner to read user input
		Scanner input = new Scanner(System.in);
		
		//Prompt for pounds of fish and price per pound
		System.out.print("Enter pounds of fish and price per pound: ");
		double lbsFish = input.nextDouble();
		double pricePerPound = input.nextDouble();
		
		//Calculate cost
		double totalCost = lbsFish * pricePerPound;
		//Round to 2 digits after decimal point
		totalCost = (int)(totalCost * 100 + 0.5) / 100.0;
		
		//Output cost
		System.out.println(lbsFish + " lbs at $" + pricePerPound + " per lb = $" + totalCost );
	
	}

}
