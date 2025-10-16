package collection;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(-8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(30);
        arrayList.add(19);

        Collections.sort(arrayList);
        int index1 = Collections.binarySearch(arrayList, 12);
        System.out.println(index1);


        StudentForArray student1 = new StudentForArray("Petr", 25);
        StudentForArray student2 = new StudentForArray("Ivan", 22);
        StudentForArray student3 = new StudentForArray("Karina", 35);
        StudentForArray student4 = new StudentForArray("Kamila", 18);
        StudentForArray student5 = new StudentForArray("Serega", 19);

        ArrayList<StudentForArray> students = new ArrayList<StudentForArray>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        Collections.sort(students);
        System.out.println(students);
        int index2 = Collections.binarySearch(students, new StudentForArray("Karina", 35));
        System.out.println(index2);

    }
}
