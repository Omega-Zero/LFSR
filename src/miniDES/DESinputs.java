												//Jeffrey Marple Oct 2018//
package miniDES;

import java.util.Scanner;

//program that asks for user input
public class DESinputs {
	public int parameterOne;
	public int parameterTwo;
	
	
	
	
	public static void main(String [] args){


			Scanner userInputs = new Scanner(System.in);
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