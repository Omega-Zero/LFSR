												//Jeffrey Marple Oct 2018//
package bitLFSR;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

//program that asks for user input
public class inputsLFSR {
	public int parameterOne;
	public int parameterTwo;
	

	public static void main(String [] args){
			int[] LFSRarray;
			int[] finalCipher = new int[1000000];
			
			Random random = new Random();
			Scanner userInputs = new Scanner(System.in);

//Select size of LFSR
			System.out.println("Select size of LFSR");
			int LFSRsize = userInputs.nextInt();
			
			if (LFSRsize>64) {
				System.out.println("Choose a number smaller than 64");
			}else{
				
			
			System.out.println("Array size set to " + LFSRsize);
			LFSRarray = new int[LFSRsize]; 
			
			for (int i = 0; i < LFSRsize; i++){
				LFSRarray[i] = random.nextInt(2);
				}
			System.out.println("Shift Register Created: ");
			for (int j = 0; j < LFSRsize; j++) {
				System.out.println(LFSRarray[j]);
				}
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

			
//Begins Shift program
			//if (args.length < 2) {
		        //System.out.println("Please provide input and output files");
//		        System.exit(0);
		    //}

		    String inputFile = "C:\\Users\\Dell User\\Documents\\binaryInput.bin"; 

		    try (
		        InputStream inputStream = new FileInputStream(inputFile);
		        //OutputStream outputStream = new FileOutputStream(outputFile);
		    ) {

		        long fileSize = new File(inputFile).length();

		        byte[] allBytes = new byte[(int) fileSize];

		        
		        inputStream.read(allBytes);
		        
		        byte bitmask = 0x00000001;
		        
		        
		        for (int i = 0; i < fileSize;) {
		        		//System.out.println(Integer.toBinaryString(allBytes[i]));
		        	    for(int j=0; j < 7; j++) {
		        	    	//System.out.println(allBytes[i]&bitmask);
		        	    	int encryptedBit= parameterTwo ^ parameterOne;
		        	    	finalCipher[i] = encryptedBit;
		        	    	bitmask = (byte) (bitmask >> 1);
		        	    }
		        		i++;
		        	}
		        for(int x=0; x<finalCipher.length; x++)
		        	System.out.println(finalCipher[x]);
		        	//outputStream.write(allBytes);

		    } catch (IOException ex) {
		        ex.printStackTrace();
		    }
	   }
//	
//
//gets the user inputed params
//	public int getparamOne() {
//		return parameterOne;
//	}
//	
//	public int getparamTwo() {
//		return parameterTwo;
//	}

}