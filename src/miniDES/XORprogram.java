package miniDES;


public class XORprogram{
	int paramOne = new DESinputs().getparamOne();
	int paramTwo = new DESinputs().getparamTwo();

	public static int XORtruth (int paramOne, int paramTwo, int bitOne , int bitTwo) {
	
		int result;
	
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