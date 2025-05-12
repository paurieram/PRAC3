package pckg;


import java.util.Random;

public class Exer_01_GCF {
	
	public static void main (String [] args) {
		/* COMPLETE */
		/* Write here a program that generates 100000 pairs of numbers
		between [1, 5000] to check that the function calculates the GCF.*/
		Random r= new Random();
		for (int i = 0; i <= 100000; i++) {
			int r1 = r.nextInt(4999)+1;
			int r2 = r.nextInt(4999)+1;
			if (iterativeGCF(r1, r2) == GCF(r1,r2)){
				System.out.println("Correct");
			}else{
				System.out.println("Wrong");
			}
		}
	}
	
	
	/* COMPLETE */
	// write here a recursive function that calculates the GCF using Dijkstra's algorithm
	public static int GCF(int n1,int n2){
		if(n1==n2){
			return n1;
		} else if (a > b) {
            return mcd(a - b, b);
        } else {
            return mcd(a, b - a);
        }
	}

	/*DO NOT MODIFY CODE BELOW*/
	public static int iterativeGCF(int x, int y) {
		// iterative gcf. Do not modify this function
		int inter;
		int small = Math.min(x, y);
		int great = Math.max(x, y);
		int remainder = great%small;
		while (remainder!=0) {
			inter = small;
			small = Math.min(small, remainder);
			great = Math.max(inter, remainder);
			remainder = great%small;
		}
		return small;
	}
	

}
