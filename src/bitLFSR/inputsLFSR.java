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
			int[] finalCipher;
			
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

//Getting Params
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

		        int fileSize = (int) new File(inputFile).length();

		        byte[] allBytes = new byte[(int) fileSize];

		        
		        inputStream.read(allBytes);
		        finalCipher = new int[fileSize];
		        
		        //XOR
		        for (int i = 0; i < fileSize; i++) {
		        		//System.out.println(Integer.toBinaryString(allBytes[i]));
		        		byte bitmask = 0x00000001;
		        	    for(int j=0; j < 7; j++) {
		        	    	
		        	    	int andBytes = allBytes[i]&bitmask;
		        	    	//System.out.println(andBytes);
		        	    	
		        	    	int encryptedBit= LFSRarray[parameterTwo] ^ LFSRarray[parameterOne];
		        	    	
		        	    	// the line  below is placing the correct bit in finalCipher[i]
		        	    	// but it should add it as a bit not overwrite the entire value
		        	    	finalCipher[i] = finalCipher[i] << 1;
		        	    	
		        	    	finalCipher[i] += andBytes ^ LFSRarray[LFSRarray.length - 1];
		        	    	allBytes[i] = (byte) (allBytes[i] >>  1);
		        	    	
		        	    	for(int k = LFSRsize - 1; k > 0; k--) {
		        	    		LFSRarray[k] = LFSRarray[k-1];
		        	    		
		        	    	}
		        	    	LFSRarray[0] = encryptedBit; 
		        	    }
		        	}

		   //outputs final encrypted array
		        for(int x=0; x<finalCipher.length; x++) {
		        	System.out.println(finalCipher[x]);
		        	//outputStream.write(allBytes);
		        }
		        
		    } catch (IOException ex) {
		        ex.printStackTrace();
		    }
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