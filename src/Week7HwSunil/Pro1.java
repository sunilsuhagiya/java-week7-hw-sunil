package Week7HwSunil;
/* Write a java program that tells us that Input number is odd or even?
 HINT: use ternary operator (? :) */

import java.util.Scanner;

public class Pro1 {
    public static void main(String[] args) {
        Pro1 obj = new Pro1(); //To call instance method object needs to be created
        obj.oddEven(); // Calling Instance method

    }

    public void oddEven() {
        Scanner scanner = new Scanner(System.in); // To get data from user
        System.out.println("Enter a Number:  ");// User input value
        int num = scanner.nextInt(); //number as input so int used
        String evenodd = (num % 2 == 0) ? "Even" : "Odd"; // ternary operator
        System.out.println(num + " is " + evenodd);//Concatenation
        scanner.close(); // close is used to minimize memory usage
    }
}
