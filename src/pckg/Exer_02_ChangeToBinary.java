package pckg;

public class Exer_02_ChangeToBinary {

	
	public static void main (String [] args) {

		/* COMPLETE */
		//Perform some tests here
		
		System.out.println(toBinaryString(5));
		System.out.println(toBinaryString(729));
	}
	
	
	public static String toBinaryString(int n) {
		/* COMPLETE */
		// Write the recursive function that creates the binary representation of n (n>=0)
		if(n==0){
			return "0";
		}else if (n==1){
			return "1";
		}else{
			return toBinaryString(n/2) + n%2;
		}
	}
	
	
}
