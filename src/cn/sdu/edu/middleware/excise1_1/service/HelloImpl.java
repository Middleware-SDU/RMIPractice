package cn.sdu.edu.middleware.excise1_1.service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 
 * @author Yonggang Yuan
 *
 */

public class HelloImpl extends UnicastRemoteObject implements Hello {

    private static final long serialVersionUID = 6363725107200698817L;

    protected HelloImpl() throws RemoteException {
        super();
    }

    @Override
    public String sayHello(String name) throws RemoteException {
        System.out.println("HelloImpl.sayHello(String name) is called");
        System.out.println("Hello, " + name);
        return name;
    }

}
