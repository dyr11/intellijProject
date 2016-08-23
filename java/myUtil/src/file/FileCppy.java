package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by dyr on 2016/7/24.
 */
public class FileCppy {
    public  static void main(String[] args){
        try {
            FileInputStream fileInputStream=new FileInputStream("fileName");
            FileOutputStream fileOutputStream=new FileOutputStream(("fileName"));
            byte[] bytes=new byte[1000];
            int length=0;
            while((length=fileInputStream.read(bytes))!=-1){
                fileOutputStream.write(bytes,0,length);
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
