package mutlithreading;

public class SynchronizedBlock1 {

    public static void main(String[] args) {
        MyRunnableImpl2 runnableImpl1 = new MyRunnableImpl2();
        Thread thread1 = new Thread(runnableImpl1);
        Thread thread2 = new Thread(runnableImpl1);
        Thread thread3 = new Thread(runnableImpl1);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter2 {

    static int count = 0;
}

class MyRunnableImpl2 implements Runnable {

    private void doWork2() {
        System.out.println("Ura!");
    }

    private void doWork1() {
        doWork2();
        synchronized (this) {
            System.out.println(++Counter2.count);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}