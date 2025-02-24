package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        List list = new ArrayList();
//        list.add("OK");
//        list.add(5);
//        list.add(true);
//        list.add(new Car());

        list.add("Hi");
        list.add("Hello");
        list.add("Bye");
        list.add("Good morning!");
        
        list.add(new Car());
        for (Object o : list) {
            System.out.println(o + " dlina " + ((String)o).length());
        }

    }
}

class Car {

}