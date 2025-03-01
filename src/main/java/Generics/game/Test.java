package Generics.game;

public class Test {

    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Kolya", 15);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Kseniya", 18);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Misha", 47);

        Team <Schoolar> schoolarTeam = new Team<>("Dragons");
        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);
    }
}
