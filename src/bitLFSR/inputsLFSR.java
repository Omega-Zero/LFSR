												//Jeffrey Marple Oct 2018//
package bitLFSR;

import java.util.Scanner;
import java.util.Random;

//program that asks for user input
public class inputsLFSR {
	public int parameterOne;
	public int parameterTwo;
	
	
	
	
	public static void main(String [] args){
			int[] LFSRarray;
			Random random = new Random();
			Scanner userInputs = new Scanner(System.in);

//Select size of LFSR
			System.out.println("Select size of LFSR");
			int LFSRsize = userInputs.nextInt();
			System.out.println("Array size set to " + LFSRsize);
			LFSRarray = new int[LFSRsize]; 
			
			for (int i = 0; i < LFSRsize; i++){
				LFSRarray[i] = random.nextInt(2);
				}
			System.out.println("Shift Register Created: ");
			for (int j = 0; j < LFSRsize; j++) {
				System.out.println(LFSRarray[j]);
				}
			
//First param Input			
			System.out.println("Select first LFSR parameter");
			int parameterOne = userInputs.nextInt();
			System.out.println("First parameter set to "+ parameterOne);
//Second param input
			System.out.println("Select second LFSR parameter");
			int parameterTwo = userInputs.nextInt();
			userInputs.close();
			System.out.println("Second parameter set to "+ parameterTwo);
			
		}

//gets the user inputed params
	public int getparamOne() {
		return parameterOne;
	}
	
	public int getparamTwo() {
		return parameterTwo;
	}
	
}