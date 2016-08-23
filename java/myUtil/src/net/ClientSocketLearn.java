package net;

import java.io.*;
import java.net.Socket;

/**
 * Created by dyr on 2016/7/27.
 */
public class ClientSocketLearn {
    public static void main(String[] args){
        try {
            Socket socket=new Socket("localhost",8888);
            OutputStream outputStream=socket.getOutputStream();
            PrintWriter printWriter=new PrintWriter(outputStream);
            System.out.println("client start !");
            InputStream inputStream=socket.getInputStream();
            InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
            printWriter.println("username:user");
            printWriter.println("password:pwd");
            printWriter.flush();
            socket.shutdownOutput();
            String line;
            while((line=bufferedReader.readLine())!=null){
                System.out.println("client:"+line);
            }

            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();
            printWriter.close();
            outputStream.close();
            socket.close();
            System.out.println("socket close!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
