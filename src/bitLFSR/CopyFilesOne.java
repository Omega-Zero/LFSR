package bitLFSR;

import java.io.*;
/**
 * Copy one file to another using low level byte streams,
 * read and write a whole.at once.
 * @author www.codejava.net
 */
public class CopyFilesOne {
 
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide input and output files");
//            System.exit(0);
        }

        String inputFile = "C:\\Users\\Dell User\\Documents\\binaryInput.bin"; 
//        byte bits;
//        bits = 5;
//        //System.out.println(bits);
// 
        try (
            InputStream inputStream = new FileInputStream(inputFile);
            //OutputStream outputStream = new FileOutputStream(outputFile);
        ) {
 
            long fileSize = new File(inputFile).length();
 
            byte[] allBytes = new byte[(int) fileSize];
 
            
            inputStream.read(allBytes);
            
            byte bitmask = 0x000F;
            
            
            for (int i = 0; i < fileSize;) {
            		//System.out.println(Integer.toBinaryString(allBytes[i]));
            		System.out.println(allBytes[i]&bitmask);
            	    //bitmask = (byte) (bitmask >> 1);
            		
            		i++;
            		
            	}
            //outputStream.write(allBytes);
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        }
    }
