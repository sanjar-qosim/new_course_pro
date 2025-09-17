package lamba;

import java.util.ArrayList;

public class StudentInfo {

    void testStudents(ArrayList<Student> aL, Check check) {
        for (Student tmp : aL) {
            if (check.check(tmp)) {
                System.out.println(tmp);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student("Petr", 20, 'M', 6.7);
        Student student2 = new Student("Marya", 21, 'F', 8.3);
        Student student3 = new Student("Misha", 23, 'M', 5.7);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        StudentInfo studentInfo = new StudentInfo();
        studentInfo.testStudents(students, (Student s) -> {return s.getSex() == 'F';});
    }
}
