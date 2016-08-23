package file;

import java.io.*;

/**
 * Created by dyr on 2016/7/24.
 */
public class PutStreamReaderAndWriterLearn {
    public static void main(String[] args) {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("fileName"), "UTF-8");
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("fileName"), "UTF-8");
            char[] chars = new char[1024];
            int length;
            while ((length = inputStreamReader.read(chars, 0, chars.length)) != -1) {
                outputStreamWriter.write(chars, 0, length);
                String str = new String(chars, 0, length);
                System.out.println(str);
            }
            outputStreamWriter.flush();
            outputStreamWriter.close();
            inputStreamReader.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
