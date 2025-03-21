package Collection.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Zaur");
        queue.offer("Oleg");
        queue.offer("Ivan");
        queue.offer("Petr");
        queue.offer("Alex");

        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
    }
}
