package miniDES;
public class XORprogram{
	

public static int XORtruth (int bitOne , int bitTwo) {
	
	int result;
	
	if(bitOne ==1 && bitTwo ==1) {
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