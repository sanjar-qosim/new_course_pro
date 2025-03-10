package Collection;

import java.util.LinkedList;

public class LinkedListEx1 {

    public static void main(String[] args) {
        StudentForLinkedList st1 = new StudentForLinkedList("Ivan", 3);
        StudentForLinkedList st2 = new StudentForLinkedList("Nikolay", 2);
        StudentForLinkedList st3 = new StudentForLinkedList("Elena", 1);
        StudentForLinkedList st4 = new StudentForLinkedList("Petr", 4);
        StudentForLinkedList st5 = new StudentForLinkedList("Mariya", 3);

        LinkedList<StudentForLinkedList> list = new LinkedList<>();

        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        System.out.println(list);
        System.out.println(list.get(2));

        StudentForLinkedList st6 = new StudentForLinkedList("Zaur", 3);
        StudentForLinkedList st7 = new StudentForLinkedList("Igor", 4);

        list.add(st6);
        System.out.println(list);

        list.add(1, st7);
        System.out.println(list);

        list.remove(3);
        System.out.println(list);
    }
}

class StudentForLinkedList {

    private final String name;
    private final int course;

    public StudentForLinkedList(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return course;
    }

    @Override
    public String toString() {
        return "StudentForLinkedList{" +
                "name='" + name + '\'' +
                ", age=" + course +
                '}';
    }
}