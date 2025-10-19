package mutlithreading;

public class InterruptionEx {

    public static void main(String[] args) {
        System.out.println("Main starts...");

        InterruptedThread thread = new InterruptedThread();
        thread.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();

        System.out.println("Main ends.");
    }
}

class InterruptedThread extends Thread {

    double sqrtSum = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 1000000; i++) {
            if(isInterrupted()) {
                System.out.println("Thread is wanted to interrupt");
                return;
            }
            sqrtSum += Math.sqrt(i);
        }
        System.out.println(sqrtSum);
    }
}