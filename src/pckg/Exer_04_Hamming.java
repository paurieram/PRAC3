package pckg;

import java.util.Random;

public class Exer_04_Hamming {


    public static void main (String [] args) {
        /* COMPLETE */

        System.out.println(checkHamming(genHamming()));
        System.out.println(checkHamming(genNotHamming()));
        System.out.println(checkHamming(genHamming()));
        System.out.println(checkHamming(genNotHamming()));
        System.out.println(checkHamming(genHamming()));
        System.out.println(checkHamming(genNotHamming()));
        System.out.println(checkHamming(genHamming()));
    }

    /* COMPLETE */
    // write here the code to determine whether a number is a Hamming number or not
    public static boolean checkHamming(int n){
        if(n==1){
            return true;
        }else if (n%2==0){
            return checkHamming(n/2);
        }else if (n%3==0){
            return checkHamming(n/3);
        }else if (n%5==0){
            return checkHamming(n/5);
        }else{
            return false;
        }

    }

    /*DO NOT MODIFY CODE BELOW*/
    private static int genHamming(){
        Random rand = new Random();
        int num = rand.nextInt(10);
        int hammingNr = 2;
        int maxNum = Integer.MAX_VALUE/14;
        while(num>=1 && hammingNr<maxNum){ //10% chance that it will stop
            int multiplier = rand.nextInt(2,7); //From 2 to 6
            hammingNr = hammingNr*multiplier;
            num = rand.nextInt(11);
        }
        return hammingNr;
    }


    private static int genNotHamming(){
        Random rand = new Random();
        int num = rand.nextInt(10);
        int notHammingNr = 7;
        int maxNum = Integer.MAX_VALUE/14;
        while(num>=1 && notHammingNr<maxNum){ //Aprox 10% chance that it will stop
            int multiplier = rand.nextInt(2,20); //From 2 to 6
            notHammingNr = notHammingNr*multiplier;
            num = rand.nextInt(11);
        }
        return notHammingNr;
    }

}
