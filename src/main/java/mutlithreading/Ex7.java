package mutlithreading;

public class Ex7 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error with Thread.sleep");
            }
        }
        System.out.println("Go!");
    }
}
