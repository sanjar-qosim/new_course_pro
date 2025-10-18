package mutlithreading.other_tasks;

public class Counter {
    static int count = 0;

    public synchronized static void increment() {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) increment();
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) increment();
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final count: " + count);
    }
}
