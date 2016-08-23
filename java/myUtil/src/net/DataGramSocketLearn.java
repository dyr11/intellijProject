package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * Created by dyr on 2016/7/27.
 */
public class DataGramSocketLearn {
    public static void main(String[] args){
        try {
            DatagramSocket datagramSocket=new DatagramSocket(8888);
            byte[] bytes=new byte[1024];
            DatagramPacket datagramPacket=new DatagramPacket(bytes,bytes.length);
            System.out.println("server start!");
            datagramSocket.receive(datagramPacket);
            String info=new String (bytes,0,datagramPacket.getLength());
            System.out.println("server:"+info);
            InetAddress inetAddress=datagramPacket.getAddress();
            int port=datagramPacket.getPort();
            byte[] inputs="server say ".getBytes();
            DatagramPacket datagramPacket1=new DatagramPacket(inputs,inputs.length,inetAddress,port);
            datagramSocket.send(datagramPacket1);
            datagramSocket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
