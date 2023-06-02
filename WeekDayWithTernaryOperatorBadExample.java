package academy.devonline.java.basic.section01_setup.section04_setup;

import java.util.Scanner;

public class WeekDayWithTernaryOperatorBadExample {
    public static void main(String[] args) {
        var day = new Scanner(System.in).nextInt();;
        String result = day == 1 ?"Monday":day == 2 ?"Tuesday":day == 3?"Wednesday":day == 4 ? "Thursday":
                day == 5 ? "Friday":day == 6 ?"Saturday":day == 7 ? "Sunday": "result"+day ;
        System.out.println(result);
    }
}
