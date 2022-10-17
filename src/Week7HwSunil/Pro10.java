package Week7HwSunil;
/*Write a java program to input any two number and ask user to enter their symbol (+, -, /, *) find addition,
 Subtraction, multiplication and division according to their symbol (using if else) */

import java.util.Scanner;

public class Pro10 {
    public static void main(String[] args) {
    Pro10 bro = new Pro10();
    bro.integration();
    }

    public void integration() {
        Scanner scan = new Scanner(System.in);
        float number1, number2, result;
        char ch;

        System.out.println("Enter any Two Numbers: ");
        number1 = scan.nextFloat();
        number2 = scan.nextFloat();
        System.out.println("Enter the Operator (+, -, *, /): ");
        ch = scan.next().charAt(0);
        if (ch == '+') result = number1 + number2;
        else if (ch == '-') result = number1 - number2;
        else if (ch == '*') result = number1 * number2;
        else if (ch == '/') result = number1 / number2;
        else {
            System.out.println("Invalid Input");
            return;
        }
        System.out.println("Result = " + result);
        scan.close();

    }
}
