package file;

import java.io.*;

/**
 * Created by dyr on 2016/7/24.
 */
public class BufferPutStreamLearn {
    public static void main(String[] args) {
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("fileName"));
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("fileName"));
            byte[] bytes = new byte[1024];
            int length;
            while ((length = bufferedInputStream.read(bytes)) != -1) {
                bufferedOutputStream.write(bytes, 0, length);
            }
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            bufferedInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }

    }
}
