package thread;

import java.util.Random;

/**
 * Created by dyr on 2016/7/28.
 */
public class MutexLearn {
    public static void main(String[] args) {
        int[] array = {123, 321};
        Object lock=new Object();

        Thread thread1 = new Thread(new runnable(array,lock),"thread1");
        Thread thread2 = new Thread(new runnable(array,lock),"thread2");
        thread1.start();
        thread2.start();
    }
}

class runnable implements Runnable {
    int[] array;
    Random random;
    Object lock;

    public runnable(int[] array, Object lock) {
        this.array = array;
        this.lock=lock;
        random = new Random(11111);
    }

    @Override
    public void run() {
        while (true) {
            int in = random.nextInt(100) - 50;
            synchronized (lock){
                if(true){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    lock.notifyAll();
                }
            }
            array[0] += in;
            Thread.yield();
            array[1] -= in;
            Thread.yield();
            int sum = array[0] + array[1];
            Thread.yield();
            System.out.println(Thread.currentThread().getName()+" sum:" + sum);
        }
    }

}
