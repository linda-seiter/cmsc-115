/**
 * DebugIt class demonstrates common errors with augmented operators.
 * @author First Last
 */
public class DebugIt {

	//TODO: Fix the operator errors
	public static void main(String[] args) {
		int planesOnRunway = 2;
		int shipsInPort = 10;
		
		//5 planes land on runway
		planesOnRunway =+ 5;   //expected result: 7
		
		//4 ships leave port
		shipsInPort =- 4;   //expected result: 6 
		
		System.out.println("Planes on runway = " + planesOnRunway);
		System.out.println("Ships in port = " + shipsInPort);
	}

}
