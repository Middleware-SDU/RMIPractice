package cn.sdu.edu.middleware.excise1_1.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 
 * @author Yonggang Yuan
 *
 */

public interface Hello extends Remote {

    public String sayHello(String name) throws RemoteException;

}
