package Generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T> {

    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participant) {
        participants.add(participant);
        System.out.println(((Participant)participant).getName() + " was successfully added to team " + name);
    }

    public void playWith(Team team){
        String winnerName;
        Random random = new Random();
        int i = random.nextInt(2);
        if (i == 0) {
            winnerName = this.name;
        } else {
            winnerName = team.name;
        }
        System.out.println("The " + winnerName + " was win!");
    }
}
