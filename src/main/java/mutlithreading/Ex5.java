package mutlithreading;

public class Ex5 {

    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        System.out.println(myThread5.getName() + "\n" + myThread5.getPriority() + "\n");

        myThread5.setName("My thread");
        myThread5.setPriority(9);
        System.out.println(myThread5.getName() + "\n" + myThread5.getPriority() + "\n");
        myThread5.setPriority(Thread.MIN_PRIORITY);
        System.out.println(myThread5.getName() + "\n" + myThread5.getPriority() + "\n");

    }
}

class MyThread5 extends Thread {

    public void run(){
        System.out.println("Hello!");
    }
}