package cn.sdu.edu.middleware.excise1_1.service;

import java.rmi.Naming;

/**
 * 
 * @author Yonggang Yuan
 *
 */

public class HelloService {

    public static void main(String[] args) {
        System.out.println("Starting Hello service......");
        try {
            HelloImpl helloImpl = new HelloImpl();
            Naming.rebind("hello", helloImpl);
        } catch (Exception e) {
            e.printStackTrace();
        } 
        System.out.println("Hello service has started, waiting to be called......");
    }

}
