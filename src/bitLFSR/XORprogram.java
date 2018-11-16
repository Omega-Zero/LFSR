package bitLFSR;


public class XORprogram{
	static int paramOne = new inputsLFSR().getparamOne();
	static int paramTwo = new inputsLFSR().getparamTwo();

	public static int XORtruth (int bitOne , int bitTwo) {
	
		int result;
//Test to make sure bits are valid
		if (bitOne!=1 && bitOne !=0) {
			System.out.println("Bit one is not binary");
		}
		if (bitTwo!=1 && bitTwo !=0) {
			System.out.println("Bit two is not binary");
		}
//truth table for XOR		
		if(bitOne== 1 && bitTwo ==1) {
			result=0;
		}
		if(bitOne== 0 && bitTwo== 0) {
			result= 0;
		}else{
			result= 1;
		}
		return result;
	}
	
	public static void main (String[] args) {
		int[] bitArray;
		bitArray = new int[10000];
		XORtruth(bitArray[paramOne], bitArray[paramTwo]);
	}


}