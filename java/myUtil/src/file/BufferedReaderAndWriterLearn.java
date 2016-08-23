package file;

import java.io.*;

/**
 * Created by dyr on 2016/7/24.
 */
public class BufferedReaderAndWriterLearn {
    public static void main(String[] args){
        try {
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(new FileInputStream("fileNAme")));
            BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("filename")));
            PrintWriter printWriter=new PrintWriter("fileName");
            String line;
            while((line=bufferedReader.readLine())!=null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                printWriter.println(line);
            }
            bufferedWriter.flush();
            printWriter.flush();
            bufferedReader.close();
            bufferedWriter.close();
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
