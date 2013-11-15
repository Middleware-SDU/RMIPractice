package cn.sdu.edu.middleware.excise1_2.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Yonggang Yuan
 *
 */

public class PrimeJudgementImpl extends UnicastRemoteObject implements PrimeJudgement {

    private static final long serialVersionUID = -5044158825415223414L;

    protected PrimeJudgementImpl() throws RemoteException {
        super();
    }

    @Override
    public boolean isPrime(int number) {
        if(number < 2) {
            return false;
        }
        if(number == 2) {
            return true;
        }
        if((number % 2) == 0) {
            return false;
        }
        for(int i=3; i<=(number/2); i++) {
            if((number % i) == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Map<String, Integer> resolve(int even) throws RemoteException {
        Map<String, Integer> result = new HashMap<>();
        System.out.println("Resoving " + even + " ......");
        for(int j=2; j<=even/2; j++) {
            if(isPrime(j) && isPrime(even-j)) {
                result.put("one", j);
                result.put("another", even-j);
                System.out.println("Resove " + even + " successfully!");
                return result;
            }
        }
        System.err.println("Resove " + even + " failure!");
        return null;
    }

}
