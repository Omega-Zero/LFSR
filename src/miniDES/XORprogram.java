package miniDES;


public class XORprogram{
	int paramOne = new DESinputs().getparamOne();
	int paramTwo = new DESinputs().getparamTwo();

	public static int XORtruth (int paramOne, int paramTwo, int bitOne , int bitTwo) {
	
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
	
}