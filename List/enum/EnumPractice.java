
import java.util.Random;

public class EnumPractice {

    public static void main(String[] args) {

        DayOfTheWeek weekDay = DayOfTheWeek.TUES;
        System.out.println(weekDay);

        for (int i = 0; i < 10; i++) {
            weekDay = getRandomDay();

            System.out.printf("Name is %s, Ordinal Value = %d%n",
                    weekDay.name(), weekDay.ordinal());

            if (weekDay == DayOfTheWeek.FRI) {
                System.out.println("Found a Friday!!!");
            }
        }
    }

    public static DayOfTheWeek getRandomDay() {
        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();
        return allDays[randomInteger];
    }
}

// ✅ Enum in the same file (but outside the Main class)
enum DayOfTheWeek {
    SUN, MON, TUES, WED, THURS, FRI, SAT
}
