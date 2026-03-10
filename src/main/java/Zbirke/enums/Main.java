package Zbirke.enums;

import java.util.Arrays;
import java.util.Random;

public class Main {
    static void main() {
        DayOfTheWeek weekDay = getRandomDay();
        System.out.println("Name is  " + weekDay + " its ordinal is " + weekDay.ordinal());


    }

    public static DayOfTheWeek getRandomDay(){
        Random ran = new Random();
        Integer random = ran.nextInt(DayOfTheWeek.values().length);
        return Arrays.asList(DayOfTheWeek.values()).get(random);
    }
}
