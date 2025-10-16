package collection;

import java.util.ArrayList;

public class ArrayListMethods2 {

    public static void main(String[] args) {
        StudentForArray st1 = new StudentForArray("Ivan", 22);
        StudentForArray st2 = new StudentForArray("Elena", 28);
        StudentForArray st3 = new StudentForArray("Petr", 23);
        StudentForArray st4 = new StudentForArray("Pavel", 22);
        StudentForArray st5 = new StudentForArray("Nikolay", 25);

        ArrayList <StudentForArray> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

        for (StudentForArray st : studentList){
            System.out.println(st);
        }

        System.out.println();
        StudentForArray st6 = new StudentForArray("Pavel", 22);
        studentList.remove(st6);

        for (StudentForArray st : studentList){
            System.out.println(st);
        }

        System.out.println();
        studentList.remove(st5);

        for (StudentForArray st : studentList){
            System.out.println(st);
        }
    }
}

class StudentForArray implements Comparable <StudentForArray> {

    private String name;
    private int age;

    public StudentForArray(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "StudentForArray{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(StudentForArray another) {
        return this.age - another.age;
    }
}