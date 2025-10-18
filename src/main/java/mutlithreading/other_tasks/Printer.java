package mutlithreading.other_tasks;

public class Printer {

    public synchronized void printMessage(String msg) throws InterruptedException {
        for (int i = 1; i <= 3; i++) {
            System.out.println(msg);
            Thread.sleep(200);
        }
    }

    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread thread1 = new Thread(() -> {
            try {
                printer.printMessage("1 thread");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                printer.printMessage("2 thread");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        thread1.start();
        thread2.start();
    }
}
