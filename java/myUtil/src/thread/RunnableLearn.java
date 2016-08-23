package thread;

/**
 * Created by dyr on 2016/7/28.
 */
public class RunnableLearn implements  Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" start !");
        int count = 1;
        while (count <= 10) {

            System.out.println(Thread.currentThread().getName() +" count:" + count++);
            Thread.yield();

        }
        System.out.println(Thread.currentThread().getName()+" end !");
    }
}
