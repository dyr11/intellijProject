package file;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Created by dyr on 2016/7/24.
 */
public class FileOperation {
    public static void main(String[] args) {
        String[] filenames = {"E:\\text", "E:\\text\\test.txt"};
        for (String filename : filenames) {
            File file = new File(filename);
            System.out.println("is directory:" + file.isDirectory());
            if (file.exists()) {
                System.out.println(filename + " exist!");
                // file.delete();
                // System.out.println(filename+"delete success!");
            } else {
                System.out.println(filename + " not exist!");
                if (file.isDirectory()) {
                    file.mkdir();
                    System.out.println("directory " + filename + " create success!");
                } else {
                    try {
                        file.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    System.out.println("file " + filename + " create success!");
                }
            }
            System.out.println("--------------------");
        }

        String s= null;
        try {
            s = new String("D:\\迅雷下载".getBytes(),"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        File file = new File(s);
        printDirectory(file);
    }

    public static void printFiles(File file) {
        if (!file.exists())
            return;
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files == null || files.length < 1)
                return;
            for (File f : files) {
                printFiles(f);
            }
        } else {
            System.out.println(file.getAbsoluteFile());
        }
    }

    public static void printDirectory(File file) {
        if (!file.exists())
            return;
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files == null || files.length < 1)
                return;
            out: for (File f : files) {
                if (f.isFile()) {
                    if(f.getAbsolutePath().endsWith("zip")){
                        System.out.println("zip-------"+f.getAbsolutePath());
                        copyFile(f.getAbsolutePath(),"L:\\download\\others");
                    }
                    continue;
                }
                File[] fs = f.listFiles();

                if(fs==null||fs.length<3)
                    continue;
                for (File subfile : fs) {
                    if(subfile.isFile()&&subfile.getName().endsWith(".bt.xltd")){
                        continue out;
                    }
                }
                System.out.println(f.getAbsolutePath());
                copyFile(f.getAbsolutePath(),"L:\\download\\others");
            }
        }
    }

    public static void copyFile(File from,File to){
        if(!from.exists()){
            System.out.println(from.getAbsolutePath()+" is not exist!");
            return;
        }
        if(!to.exists()){
            to.mkdirs();
        }

        if(from.isFile()){
            File dest=new File(to.getAbsolutePath()+"\\"+from.getName());
            System.out.println(from.getAbsolutePath()+":"+dest.getAbsolutePath());
            if(from.renameTo(dest)){
                from.delete();
            }

            return;
        }

        for(File f:from.listFiles()){
            copyFile(f.getAbsolutePath(),to.getAbsoluteFile()+"\\"+from.getName());
            from.delete();
        }


    }

    public static void copyFile(String from,String to){
      //  System.out.println("copy from "+from+" to "+to);
        copyFile(new File(from),new File(to));
    }
}
