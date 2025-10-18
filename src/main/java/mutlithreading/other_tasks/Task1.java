package mutlithreading.other_tasks;

public class Task1 {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new firstThread());
        Thread thread2 = new Thread(new secondThread());
        Thread thread3 = new Thread(new thirdThread());

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread3.start();
    }
}

class firstThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}

class secondThread implements Runnable {
    @Override
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println(c);
        }
    }
}

class thirdThread implements Runnable {
    @Override
    public void run() {
        for (int i = 6; i <= 10; i++) {
            System.out.println("Done");
        }
    }
}