package mutlithreading;

public class DeadLockEx {

    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();

        thread10.start();
        thread20.start();
    }
}

class Thread10 extends Thread {

    @Override
    public void run(){
        System.out.println("Thread10: try to catch monitor of object lock1");
        synchronized (DeadLockEx.lock1) {
            System.out.println("Thread10: the lock1 was caught");

            System.out.println("Thread10: try to catch monitor of object lock2");
            synchronized (DeadLockEx.lock2) {
                System.out.println("Thread10: the lock2 was caught");
            }
        }
    }
}

class Thread20 extends Thread {

    @Override
    public void run(){
        System.out.println("Thread20: try to catch monitor of object lock2");
        synchronized (DeadLockEx.lock2) {
            System.out.println("Thread20: the lock2 was caught");

            System.out.println("Thread20: try to catch monitor of object lock1");
            synchronized (DeadLockEx.lock1) {
                System.out.println("Thread20: the lock1 was caught");
            }
        }
    }
}