package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test5 {

    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 5, 9, 12, 21, 7, 18};

        arr = Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(arr));

        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Durov", 'm', 23, 3, 7.4);

        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

        studentList = studentList.stream()
                .sorted((x, y) -> x.getName().compareTo(y.getName()))
                .collect(Collectors.toList());
        System.out.println(studentList);
    }
}
