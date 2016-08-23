package reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by dyr on 2016/8/9.
 */
public class MethodReflectLearn {
    public int add(int x,int y){
        System.out.println(x+y);
        return x+y;
    }
    public int add(int x,int y,int z){
        System.out.println(x+y+z);
        return x+y+z;
    }
    public int add(int x,int y,double z){
        System.out.println(x+y+z);
        return x+y;
    }

    public static void main(String[] args) {
        Class c=MethodReflectLearn.class;
        try {
            Method method=c.getMethod("add",new Class[]{int.class,int.class,double.class});
            int sum= (int) method.invoke(c.newInstance(),10,20,10.0);
            System.out.println("sum :"+sum);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
