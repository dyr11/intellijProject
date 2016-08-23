package file;

import java.io.*;

/**
 * Created by dyr on 2016/7/24.
 */
public class DataPutStreamLearn {
    public static void main(String[] args){
        try {
            DataOutputStream dataOutputStream=new DataOutputStream(new FileOutputStream("fileName"));
            DataInputStream dataInputStream=new DataInputStream(new FileInputStream("fileName"));
            dataOutputStream.writeInt(1234);
            dataOutputStream.writeDouble(12.13);
            dataOutputStream.writeUTF("hello world");
            dataOutputStream.writeChars("hello world");
            int int1=dataInputStream.readInt();
            double double1=dataInputStream.readDouble();
            String str1=dataInputStream.readUTF();
            char str2=dataInputStream.readChar();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
