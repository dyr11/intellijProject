package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by dyr on 2016/7/27.
 */
public class INetAddressLearn {
    public static void main(String[] args){
        try {
            InetAddress inetAddress=InetAddress.getLocalHost();
            System.out.println(inetAddress.getHostName());

            InetAddress inetAddress1=InetAddress.getByName("127.0.0.1");
            System.out.println(inetAddress1.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
