package comparation.other_tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingStudents {

    public static void main(String[] args) {
        Student student1 = new Student("Sasha", 2, "Finance");
        Student student2 = new Student("Pavel", 1, "IT");
        Student student3 = new Student("Marina", 2, "Design");
        Student student4 = new Student("Sasha", 3, "IT");
        Student student5 = new Student("Anya", 3, "Law");

        List <Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        System.out.println(studentList);
        Collections.sort(studentList, new SortByName());
        System.out.println(studentList);
        Collections.sort(studentList, new SortByCourse());
        System.out.println(studentList);
        Collections.sort(studentList, new SortByDepartment());
        System.out.println(studentList);
    }
}

class Student {

    private String name;
    private int course;
    private String department;

    public Student(String name, int course, String department) {
        this.name = name;
        this.course = course;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", department='" + department + '\'' +
                '}';
    }
}

class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2){
        return student1.getName().compareTo(student2.getName());
    }
}

class SortByCourse implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2){
        return Integer.compare(student1.getCourse(), student2.getCourse());
    }
}

class SortByDepartment implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2){
        return student1.getDepartment().compareTo(student2.getDepartment());
    }
}