package enums;

import java.util.Arrays;

public class Enum1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.SATURDAY);
        today.daysInfo();
        WeekDays w = WeekDays.FRIDAY;
        System.out.println(w.getMood());

        WeekDays w15 = WeekDays.valueOf("MONDAY");
        System.out.println(w15);

        WeekDays [] weekDaysAll = WeekDays.values();
        System.out.println(Arrays.toString(weekDaysAll));
    }
}

enum WeekDays {
    MONDAY("bad"),
    TUESDAY("bad"),
    WEDNESDAY("so-so"),
    THURSDAY("so-so"),
    FRIDAY("good"),
    SATURDAY("nice"),
    SUNDAY("very nice");

    private String mood;
    private WeekDays(String mood) {
        this.mood = mood;
    }

    public String getMood() {
        return mood;
    }
}
class Today {
    WeekDays weekDay;
    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo(){
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case FRIDAY:
                System.out.println("Go to work!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Just relax.");
                break;
        }
        System.out.println("The mood is: " + weekDay.getMood());
    }
}