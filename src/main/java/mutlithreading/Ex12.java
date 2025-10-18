package mutlithreading;

public class Ex12 {

    private static final Object lock = new Object();

    void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile call finished");
        }
    }

    void skypeCall() {
        synchronized (lock) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call finished");
        }
    }

    void whatsappCall() {
        synchronized (lock) {
            System.out.println("Whatsapp call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Whatsapp call finished");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWhatsapp());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableImplMobile implements Runnable {

    @Override
    public void run() {
        Ex12 ex12 = new Ex12();
        ex12.mobileCall();
    }
}

class RunnableImplSkype implements Runnable {

    @Override
    public void run() {
        Ex12 ex12 = new Ex12();
        ex12.skypeCall();
    }
}

class RunnableImplWhatsapp implements Runnable {

    @Override
    public void run() {
        Ex12 ex12 = new Ex12();
        ex12.whatsappCall();
    }
}