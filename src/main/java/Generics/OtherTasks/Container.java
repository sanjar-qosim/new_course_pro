package Generics.OtherTasks;

import java.util.ArrayList;
import java.util.List;

public class Container <T> {

     private List<T> list = new ArrayList<>();

    public void addIfNotPresent(T item) {
        if (!list.contains(item)) {
            list.add(item);
        }
    }

    public void printItems(){
        for (T l : list) {
            System.out.println(l);
        }
    }

    public int size(){
        return list.size();
    }
}

class ContainerTest {

    public static void main(String[] args) {
        Container<String> words = new Container<>();
        words.addIfNotPresent("Hello");
        words.addIfNotPresent("World");
        words.addIfNotPresent("Hello");
        words.printItems();
        System.out.println(words.size());
    }
}
