package file;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

/**
 * Created by dyr on 2016/7/24.
 */
public class SerializedLearn implements Serializable {
    public int x;
    private String k;
    private transient List<FileEncode> list;

    public SerializedLearn(int x, String k) {
        this.x = x;
        this.k = k;
    }

    public String getK() {

        return k;
    }

    public void setK(String k) {
        this.k = k;
    }

    public List<FileEncode> getList() {
        return list;
    }

    public void setList(List<FileEncode> list) {
        this.list = list;
    }

    public void writeObject(ObjectOutputStream objectOutputStream) {
        try {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(new Object());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readObject(ObjectInputStream objectInputStream) {
        try {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
