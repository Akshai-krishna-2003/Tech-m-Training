package PrimitiveAndReferenceVariable;

import java.util.Scanner;

enum DaysOfWeek{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    day, SUNDAY
}

public class EnumExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of week: ");
        String day = sc.next();

        // use valueOf() for enums
        DaysOfWeek d = DaysOfWeek.valueOf(day);


        switch (d) {
            case MONDAY:
                System.out.println("Not Holiday");
                break;

            case TUESDAY:
                System.out.println("Not Holiday");
                break;

            case WEDNESDAY:
                System.out.println("Not Holiday");
                break;

            case THURSDAY:
                System.out.println("Not Holiday");
                break;

            case FRIDAY:
                System.out.println("Not Holiday");
                break;

            case SATURDAY:
                System.out.println("Holiday");
                break;

            case SUNDAY:
                System.out.println("Holiday");
                break;
        }
    }
}
