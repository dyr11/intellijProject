package net;

import java.io.IOException;
import java.net.*;

/**
 * Created by dyr on 2016/7/27.
 */
public class DataGramSocketClientLearn {
    public static void main(String[] args) {
        try {
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            byte[] data="hello world".getBytes();
            DatagramPacket datagramPacket=new DatagramPacket(data,data.length,inetAddress,8888);
            DatagramSocket datagramSocket=new DatagramSocket();
            System.out.println("client start!");
            datagramSocket.send(datagramPacket);

            byte[] gets=new byte[1024];
            DatagramPacket datagramPacket1=new DatagramPacket(gets,gets.length);
            datagramSocket.receive(datagramPacket1);
            String info= new String(gets,0,datagramPacket1.getLength());
            System.out.println("client:"+info);
            datagramSocket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
