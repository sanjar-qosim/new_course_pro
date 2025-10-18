package mutlithreading.other_tasks;

public class CounterTask implements Runnable{

    @Override
    public void run() {
        synchronized (Counter.class) {
            for (int i = 0; i < 1000; i++) {
                Counter.count++;
            }
            System.out.println(Counter.count);
        }
    }

    public static void main(String[] args) {

        Thread thread1 = new Thread(new CounterTask());
        Thread thread2 = new Thread(new CounterTask());
        Thread thread3 = new Thread(new CounterTask());
        Thread thread4 = new Thread(new CounterTask());
        Thread thread5 = new Thread(new CounterTask());

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
