package mutlithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("John", lock);
        new Employee("Ivan", lock);
        new Employee("Petr", lock);
        new Employee("Jack", lock);
        new Employee("Sam", lock);
    }
}

class Employee extends Thread {

    String name;
    private Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " is waiting...");
            lock.lock();
            System.out.println(name + " is using with bankomat...");
            Thread.sleep(200);
            System.out.println(name + " has finished his work.");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}