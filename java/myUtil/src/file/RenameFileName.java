package file;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import com.sun.org.apache.xml.internal.serializer.utils.SystemIDResolver;

import java.io.File;

/**
 * Created by dyr on 2016/8/14.
 */
public class RenameFileName {
    public static void main(String[] args) {

        String[] files = {"D:\\迅雷下载","H:\\temp"};
        rename(files);
    }

    public static void rename(File file) {
        if (!file.exists()) {
            System.out.println(file.getAbsoluteFile() + " not exist!");
            return;
        }

        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                rename(f);
            }
            return;
        }

        if (file.isFile()) {
            String from = file.getAbsolutePath();
            if (from.endsWith(".xltd")) {
                String to = from.replaceAll("xltd$", "td");
                System.out.println(from + "====>>>" + to);
                file.renameTo(new File(to));
            }
        }
    }

    public static void rename(String file) {
        rename(new File(file));
    }

    public static void reanme(File[] file) {
        for (File f : file) {
            System.out.println("==========="+f.getAbsolutePath()+"==========");
            rename(f);
        }
    }

    public static void rename(String[] file) {
        for (String f : file) {
            rename(f);
        }
    }
}
