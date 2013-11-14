package cn.sdu.edu.middleware.excise1_2.service;

import java.rmi.Naming;


/**
 * 
 * @author Yonggang Yuan
 *
 */

public class PrimeService {

    public static void main(String[] args) {
        System.out.println("Starting primeJudgement service......");
        try {
            PrimeJudgement primeJudgement = new PrimeJudgementImpl();
            Naming.rebind("primeJudgement", primeJudgement);
        } catch (Exception e) {
            e.printStackTrace();
        } 
        System.out.println("PrimeJudgement service has been started, waiting to be called......");
    }

}
