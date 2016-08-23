package annoation;

import java.lang.annotation.Target;
import java.lang.reflect.Method;

/**
 * Created by dyr on 2016/8/10.
 */
@doc(name="class",age=10)
public class AnnonationLearn {
    @doc(name="method",age=20)
    public void f(){

    }

    public static void main(String[] args) {
        Class annonation=AnnonationLearn.class;
        if(annonation.isAnnotationPresent(doc.class)){
            System.out.println("-------yes--------");
            doc dos= (doc) annonation.getAnnotation(doc.class);
            System.out.println(dos.name()+":"+dos.age());

            Method[] methods=annonation.getMethods();
            for(Method method:methods){
                if(method.isAnnotationPresent(doc.class)){
                    doc doc1=method.getAnnotation(doc.class);
                    System.out.println(doc1.name()+":"+doc1.age());

                }
            }
        }else{
            System.out.println("---------no--------");
        }
    }
}
