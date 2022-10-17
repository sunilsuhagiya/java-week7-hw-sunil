package Week7HwSunil;

import java.util.Scanner;

/* Write a java program to input any year like (ex.2007) and find out if it is leap year or
not? */
public class Pro2 {
    public static void main(String[] args) {
        Pro2 obj = new Pro2();//Object created to call instance method
        obj.leapYear();// Instance method calling

    }

    void leapYear() {
        int year; // as year is number declared int
        System.out.println("Enter any Year"); // user input data
        Scanner y = new Scanner(System.in); // user defined data
        year = y.nextInt(); //defining int

        if (year % 100 == 0 && year % 400 == 0 || year % 100 != 0 && year % 4 == 0) { //Condition 1 & 2
            System.out.println("This is Leap Year");
        } else {
            System.out.println("This is Not a Leap Year");

        }
    }
}
