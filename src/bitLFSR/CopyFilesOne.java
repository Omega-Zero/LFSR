package bitLFSR;

import java.io.*;
/**
 * Copy one file to another using low level byte streams,
 * read and write a whole.at once.
 * @author www.codejava.net
 */
public class CopyFilesOne {
 
    public static void main(String[] args) {
        //if (args.length < 2) {
        //    System.out.println("Please provide input and output files");
        //    System.exit(0);
        //}
 
        String inputFile = "C:\\Users\\Dell User\\Documents\\binaryInput.bin"; //args[0];
        //String outputFile = args[1];
 
 
        try (
            InputStream inputStream = new FileInputStream(inputFile);
            //OutputStream outputStream = new FileOutputStream(outputFile);
        ) {
 
            long fileSize = new File(inputFile).length();
 
            byte[] allBytes = new byte[(int) fileSize];
 
            inputStream.read(allBytes);
            
            for (int i = 0; i < fileSize; i++) {
            	System.out.println(Integer.toBinaryString(allBytes[i]));
            }
            
 
            //outputStream.write(allBytes);
 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        int[] XORbitArray = {1, 1, 0, 0};
        XORbitArray = new int[10000]; 
        }
    }
    