package cn.sdu.edu.middleware.excise1_2.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 
 * @author Yonggang Yuan
 *
 */

public interface PrimeJudgement extends Remote {

    public boolean isPrime(int number) throws RemoteException;

}
