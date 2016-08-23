package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by dyr on 2016/7/24.
 */
public class FileOutputStreamLearn {
    public static void main(String[] arg){
        try {
            FileOutputStream fileOutputStream=new FileOutputStream("fileName",true);//true:append ,default:false delete and recreate file
            fileOutputStream.write(123);
            byte[] bytes=new String("hello world").getBytes();
            fileOutputStream.write(bytes,0,bytes.length);
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
