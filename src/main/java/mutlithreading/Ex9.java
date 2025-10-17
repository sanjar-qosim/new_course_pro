package mutlithreading;

public class Ex9 {

    public static void main(String[] args) {
        System.out.println("MethodL Main begins");

        Thread thread = new Thread(new Worker());
        System.out.println("Statement: " + thread.getState());

        thread.start();
        System.out.println("Statement: " + thread.getState());
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Statement: " + thread.getState());
        System.out.println("Method Main ends");
    }
}

class Worker implements Runnable {


    @Override
    public void run() {
        System.out.println("Worker started his job...");

        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Work end!");
    }
}