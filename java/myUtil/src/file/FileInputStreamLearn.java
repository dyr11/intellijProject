package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by dyr on 2016/7/24.
 */
public class FileInputStreamLearn {
    public static void main(String[] args){
        try {
            FileInputStream fileInputStream=new FileInputStream("fileName");
            int input=fileInputStream.read();
            byte inputByte=(byte)input;
            byte[] bytes=new byte[1000];
            int length=fileInputStream.read(bytes);//if meet EOF,length=-1;in
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
