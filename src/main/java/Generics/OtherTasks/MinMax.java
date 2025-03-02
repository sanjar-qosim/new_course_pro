package Generics.OtherTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMax <T extends Comparable<T>> {

    private List<T> list = new ArrayList<>();

    public void add(T item){
        list.add(item);
    }

    public void printList(){
        for (T l : list) {
            System.out.println(l);
        }
    }

    public T getMin(){
        return Collections.min(list);
    }

    public T getMax(){
        return Collections.max(list);
    }
}

class MinMaxTest {

    public static void main(String[] args) {
        MinMax <Integer> numbers = new MinMax<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(7);
        numbers.add(5);

        numbers.printList();

        System.out.println(numbers.getMin());
        System.out.println(numbers.getMax());
    }
}
