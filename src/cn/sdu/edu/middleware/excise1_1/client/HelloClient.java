package cn.sdu.edu.middleware.excise1_1.client;

import java.rmi.Naming;
import cn.sdu.edu.middleware.excise1_1.service.Hello;

/**
 * 
 * @author Yonggang Yuan
 *
 */

public class HelloClient {

    public static void main(String[] args) {
        String hostname = "localhost:1099";

        if(args.length > 0) {
            hostname = args[0];
        }

        System.out.println("Getting instance of remote object......");
        Hello hello = null;

        try {
            hello = (Hello) Naming.lookup("rmi://" + hostname + "/hello");
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(hello == null) {
            System.out.println("Failed to get remote object's instance");
            return;
        }

        System.out.println("Doing RMI......");
        try {
            System.out.println("Get " + hello.sayHello("Yonggang Yuan") + "from remote");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
