package mutlithreading;

public class Ex10 {

    // Data race
    public static void main(String[] args) {
        MyRunnableImpl1 runnableImpl1 = new MyRunnableImpl1();
        Thread thread1 = new Thread(runnableImpl1);
        Thread thread2 = new Thread(runnableImpl1);
        Thread thread3 = new Thread(runnableImpl1);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter {

    static int count = 0;
}

class MyRunnableImpl1 implements Runnable {

    public void increment() {
        System.out.print(++Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}