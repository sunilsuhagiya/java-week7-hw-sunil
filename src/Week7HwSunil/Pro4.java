package Week7HwSunil;

import java.util.Random;
import java.util.Scanner;

public class Pro4 {
    public static void main(String[] args) {
        isLeapYear(2000);
        getDaysInMonth(1, 2000);
    }

    public static void isLeapYear(int year) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year: ");
        year = scanner.nextInt();
        boolean isLeap = false;
        if (year >= 1 && year <= 9999 && year % 4 == 0) {
            if (year % 400 == 0) {
                if (year % 100 == 0)
                    isLeap = true;
                else isLeap = false;
            }
        }
        if (isLeap == true) {
            System.out.println(year + "A Leap Year");
        } else {
            System.out.println(year + "Not A Leap Year");
        }
    }

    public static int getDaysInMonth(int month, int year) {
        Scanner scan = new Scanner(System.in);
        int numberofdaysinmonth = 0;
        String nameofmonth = "Not Known";
        System.out.println("Enter Month in Number: ");
        month = scan.nextInt();
        System.out.println("Enter year: ");
        year = scan.nextInt();
        switch (month) {
            case 1:
                nameofmonth = "Jan";
                numberofdaysinmonth = 31;
                break;
            case 2:
                nameofmonth = "Feb";
                if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                    numberofdaysinmonth = 29;
                } else {
                    numberofdaysinmonth = 28;
                }
                break;
            case 3:
                nameofmonth = "Mar";
                numberofdaysinmonth = 31;
            case 4:
                nameofmonth = "Apr";
                numberofdaysinmonth = 30;
            case 5:
                nameofmonth = "May";
                numberofdaysinmonth = 31;
            case 6:
                nameofmonth = "Jun";
                numberofdaysinmonth = 30;
            case 7:
                nameofmonth = "Jul";
                numberofdaysinmonth = 31;
            case 8:
                nameofmonth = "Aug";
                numberofdaysinmonth = 31;
            case 9:
                nameofmonth = "Sep";
                numberofdaysinmonth = 30;
            case 10:
                nameofmonth = "Oct";
                numberofdaysinmonth = 31;
            case 11:
                nameofmonth = "Nov";
                numberofdaysinmonth = 30;
            case 12:
                nameofmonth = "Dec";
                numberofdaysinmonth = 31;
        }
        System.out.println(nameofmonth + " " + year + "has" + numberofdaysinmonth + "days");
        return numberofdaysinmonth;
    }
}