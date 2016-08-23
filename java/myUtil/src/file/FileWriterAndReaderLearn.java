package file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by dyr on 2016/7/24.
 */
public class FileWriterAndReaderLearn {
    public static void main(String[] args){
        try {
            FileReader fileReader=new FileReader("fileName");
            FileWriter fileWriter=new FileWriter("fileName",true);//true:append ,default:false,delete context;
            char[] chars=new char[1024];
            int length;
            while((length=fileReader.read(chars,0,chars.length))!=-1){
                fileWriter.write(chars,0,length);
                String str=new String(chars,0,length);
                System.out.println(str);
            }
            fileWriter.flush();
            fileReader.close();
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
