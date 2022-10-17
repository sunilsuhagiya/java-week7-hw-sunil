package Week7HwSunil;

import java.util.Scanner;

// Write a Java program which input any number between 1 to 7 and it print The Days
//name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
// NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
public class Pro13 {
    public static void main(String[] args) {
        week();
    }

    public static void week() {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter any number between 1 to 7: ");
        int d;
        d = n.nextInt();
        if (d < 1 || d > 7) {
            System.out.println("Enter valid day in a week there is only 7 days ");
            System.exit(0);
        }
        switch (d) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;
        }
        n.close();
    }
}
