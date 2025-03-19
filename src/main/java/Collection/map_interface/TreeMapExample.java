package Collection.map_interface;

import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();

        Student student1 = new Student("Paul", "White", 1);
        Student student2 = new Student("Zaur", "Tregulov", 3);
        Student student3 = new Student("Sergey", "Petrov", 2);
        Student student4 = new Student("Paul", "White", 1);
        Student student5 = new Student("Zaur", "Tregulov", 3);
        Student student6 = new Student("Sergey", "Petrov", 2);
        Student student7 = new Student("Sergey", "Petrov", 2);
        Student student8 = new Student("Sergey", "Petrov", 2);

        treeMap.put(5.8, student1);
        treeMap.put(6.4, student2);
        treeMap.put(8.2, student6);
        treeMap.put(7.5, student4);
        treeMap.put(9.1, student7);
        treeMap.put(7.2, student3);
        treeMap.put(7.9, student5);
        treeMap.put(3.2, student8);

        System.out.println(treeMap);
        System.out.println(treeMap.get(9.1));
        System.out.println(treeMap.get(1.5));
        treeMap.remove(5.8);
        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());

    }
}
