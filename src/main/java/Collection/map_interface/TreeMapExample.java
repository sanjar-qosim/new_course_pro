package Collection.map_interface;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        Student student1 = new Student("Masha", "Pavlovna", 2);
        Student student2 = new Student("Ivan", "Ivanov", 1);
        Student student3 = new Student("Gorya", "Mamaev", 2);
        Student student4 = new Student("Grisha", "Pashev", 3);
        Student student5 = new Student("John", "Doe", 1);

        TreeMap<Double, Student> map = new TreeMap<>();
        map.put(6.4, student1);
        map.put(5.8, student2);
        map.put(8.7, student3);
        map.put(5.5, student4);
        map.put(4.2, student5);

        System.out.println(map);
        System.out.println(map.lastEntry());
        System.out.println(map.tailMap(6.2));
        System.out.println(map.headMap(6.2));
        System.out.println(map.firstEntry());
        System.out.println();

        TreeMap<Student, Double> map2 = new TreeMap<>();
        map2.put(student1, 6.4);
        map2.put(student2, 5.8);
        map2.put(student3, 8.7);
        map2.put(student4, 5.5);
        map2.put(student5, 4.2);
        System.out.println(map2);

        TreeMap<Student, Double> map3 = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        map3.put(student1, 6.4);
        map3.put(student2, 5.8);
        map3.put(student3, 8.7);
        map3.put(student4, 5.5);
        map3.put(student5, 4.2);
        System.out.println(map3);


    }
}
