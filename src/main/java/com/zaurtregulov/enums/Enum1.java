package com.zaurtregulov.enums;

public class Enum1 {
    public static void main(String[] args) {
        Today today = new Today(WeekDays.THURSDAY);
        today.daysInfo();
    }
}

enum WeekDays {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
}

class Today {
    WeekDays weekDay;

    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo() {
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Go work");
                break;
            case SUNDAY:
            case SATURDAY:
                System.out.println("sleep");
                break;
        }
    }

}
