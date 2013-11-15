package cn.sdu.edu.middleware.excise1_2.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;

/**
 * 
 * @author Yonggang Yuan
 *
 */

public interface PrimeJudgement extends Remote {

    public boolean isPrime(int number) throws RemoteException;

    public Map<String, Integer> resolve(int even) throws RemoteException;

}
