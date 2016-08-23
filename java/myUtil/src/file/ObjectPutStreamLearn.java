package file;

import java.io.*;

/**
 * Created by dyr on 2016/7/24.
 */
public class ObjectPutStreamLearn {
    public static void main(String[] args){
        try {
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("fileName"));
            ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("fileName"));
            objectOutputStream.writeObject(new Object());
            Object object=objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
