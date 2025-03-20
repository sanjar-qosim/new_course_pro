package Collection.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {

    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();

        Student student1 = new Student("Paul", "White", 1);
        Student student2 = new Student("Zaur", "Tregulov", 3);
        Student student3 = new Student("Sergey", "Petrov", 2);

        map.put(student1, 7.5);
        map.put(student2, 8.7);
        map.put(student3, 9.2);

        System.out.println(map);

        Student student4 = new Student("Zaur", "Tregulov", 3);

        boolean result = map.containsKey(student4);
        System.out.println("result: " + result);

        System.out.println(student2.hashCode());
        System.out.println(student4.hashCode());

        Map<Integer, Student> map2 = new HashMap<>();
        Student student10 = new Student("Anvar", "Madridov", 1);
        Student student11 = new Student("Ulug'bek", "Izzatulaev", 3);
        Student student12 = new Student("Sirojiddin", "Japparov", 2);
        map2.put(1, student10);
        map2.put(2, student11);
        map2.put(3, student12);
        System.out.println(map2);

        for (Map.Entry<Student, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}

class Student implements Comparable <Student> {
    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
