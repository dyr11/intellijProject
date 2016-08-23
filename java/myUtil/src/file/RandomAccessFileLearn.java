package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by dyr on 2016/7/24.
 */
public class RandomAccessFileLearn {

    public static void main(String[] args){
        File file=new File("...");
        try {
            RandomAccessFile randomAccessFile=new RandomAccessFile(file,"WR");
            randomAccessFile.getFilePointer();
            randomAccessFile.seek(100);
            randomAccessFile.write('a');
            byte[] bytes=new String("asdasdasd").getBytes();
            randomAccessFile.write(bytes);
            randomAccessFile.writeInt(23123);
            byte[] bytes1=new byte[100];
            randomAccessFile.read(bytes1);
            randomAccessFile.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
