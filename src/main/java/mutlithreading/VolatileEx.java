package mutlithreading;

public class VolatileEx extends Thread {

    volatile boolean b = true;

    public void run() {
        long counter = 0;
        while (b) {
            counter++;
        }
        System.out.println("The loop in run() method was finished. Counter = " + counter);
    }

    public static void main(String[] args) {
        VolatileEx thread = new VolatileEx();
        thread.start();
        System.out.println("After 3 seconds it is time to wake up!");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.b = false;

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End of program.");
    }
}
