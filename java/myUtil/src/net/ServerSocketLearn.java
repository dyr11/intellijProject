package net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by dyr on 2016/7/27.
 */
public class ServerSocketLearn {
    public static void main(String[] args) {

        ServerSocket serverSocket = null;
        Socket socket = null;
        try {
            serverSocket = new ServerSocket(8888);
            System.out.println("server start !");
            while (true) {
                socket = serverSocket.accept();
                Thread thread = new Server(socket);
                thread.run();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Server extends Thread {
    private Socket socket;

    public Server(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        super.run();
        try {
            System.out.println("socket start!");
            InputStream inputStream = socket.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            OutputStream outputStream = socket.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("server:" + line);
                bufferedWriter.write(line + "\n");
            }
            ;
            bufferedWriter.flush();
            socket.shutdownOutput();
            bufferedWriter.close();
            outputStreamWriter.close();
            outputStream.close();

            bufferedReader.close();
            inputStreamReader.close();
            inputStream.close();
            socket.close();
            System.out.println("socket close!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
