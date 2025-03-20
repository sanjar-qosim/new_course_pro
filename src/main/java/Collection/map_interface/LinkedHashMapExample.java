package Collection.map_interface;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        Student student1 = new Student("Masha", "Pavlovna", 2);
        Student student2 = new Student("Ivan", "Ivanov", 1);
        Student student3 = new Student("Gorya", "Mamaev", 2);
        Student student4 = new Student("Grisha", "Pashev", 3);

        LinkedHashMap<Double, Student> map = new LinkedHashMap<>(16, 0.75f, true);
        map.put(6.4, student1);
        map.put(5.8, student2);
        map.put(8.7, student3);
        map.put(5.5, student4);

        System.out.println(map);

    }
}
