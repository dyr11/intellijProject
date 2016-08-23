package reflect;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by dyr on 2016/8/9.
 */
public class classLearn {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class class1 = classLearn.class;
        Class class2 = new classLearn().getClass();
        Class class3 = Class.forName("reflect.classLearn");

        System.out.println(class1 == class2);
        System.out.println(class1 == class3);
        System.out.println(class3 == class2);
        classLearn ClassLearn = (reflect.classLearn) class1.newInstance();
        Class class4 = int.class;
        Class class5 = void.class;
        System.out.println(class4.getName());
        System.out.println(class5.getName());
        System.out.println(class3.getName());
        System.out.println(class3.getSimpleName());

        Class stringClass = String.class;
        Method[] methods = stringClass.getMethods();
        for (Method method : methods) {
            Class returnClass = method.getReturnType();
            System.out.print(returnClass.getName() + " :");
            System.out.print(method.getName());
            Class[] paramsClasses = method.getParameterTypes();
            for (Class c : paramsClasses) {
                System.out.print("      " + c.getTypeName());
            }
            System.out.println();
        }

        System.out.println("--------------------------");
        Field[] fields = stringClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.print(field.getType() + " : ");
            System.out.println(field.getName());

        }
        System.out.println("-----------------------------");
        Constructor[] constructors = stringClass.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.print(constructor.getName() + ":");
            Class[] params = constructor.getParameterTypes();
            for (Class c : params) {

                System.out.print(" "+c.getTypeName());
            }
            System.out.println();
        }
    }
}
