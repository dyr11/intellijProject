package thread;

/**
 * Created by dyr on 2016/7/28.
 */
public class ThreadLearn extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName()+" start !");
        int count = 1;
        while (count <= 10) {
            System.out.println(Thread.currentThread().getName()+" count:" + count++);
            Thread.yield();

        }
        System.out.println(Thread.currentThread().getName() +" end !");
    }

    public static void main(String[] args) {
        ThreadLearn threadLearn = new ThreadLearn();
        threadLearn.setName("mr");
        Thread thread=new Thread(new RunnableLearn(),"ms");
        threadLearn.start();
        thread.start();
    }
}

