package cn.sdu.edu.middleware.excise1_2.client;

import java.rmi.Naming;
import cn.sdu.edu.middleware.excise1_2.service.PrimeJudgement;

/**
 * 
 * @author Yonggang Yuan
 *
 */

public class PrimeTest {

    private static String hostname = "localhost:1099";
    private static PrimeJudgement primeJudgement = null;

    public static void main(String[] args) {

        if(args.length > 0) {
            hostname = args[0];
        }

        System.out.println("Getting prime judgement instance of remote object......");

        try {
            primeJudgement = (PrimeJudgement) Naming.lookup("rmi://" + hostname + "/primeJudgement");
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(primeJudgement == null) {
            System.out.println("Failed to get remote prime judgement instance");
            return;
        }

        System.out.println("Do judging......");
        printTwoPrimes4Evens(4, 10);
        System.out.println("Finish judgement");
    }

    public static void printTwoPrimes4Evens(int startEven, int count) {
        if(count<1) {
            System.err.println("Please give a count bigger than 1");
            return;
        }
        if(startEven <= 2 || (startEven %2 ) != 0) {
            System.err.println("Please give a even which is bigger than 2 for start number");
            return;
        }
        try {
            for(int i=startEven; i<=(startEven+2*count); i+=2) {
                for(int j=2; j<=i/2; j++) {
                    if(primeJudgement.isPrime(j) && primeJudgement.isPrime(i-j)) {
                        System.out.println(i +" = "+ j +" + "+(i-j));
                        break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
