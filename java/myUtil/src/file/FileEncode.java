package file;

import java.io.UnsupportedEncodingException;

/**
 * Created by dyr on 2016/7/24.
 */
public class FileEncode {
    public static void main(String[] args) {
        String str1 = "哈啊哈hello";
        try {
            byte[] bytes = str1.getBytes("UTF-8");
            for (byte by : bytes) {
                System.out.print(Integer.toHexString(by&0xff)+" ");
            }
            String str2=new String(bytes,"UTF-8");
            System.out.println("\n"+str2);
            System.out.println(new String(bytes,"GBK"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
