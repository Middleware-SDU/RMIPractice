package cn.sdu.edu.middleware.excise1_2.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

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

}
