package Week7HwSunil;
/* Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if any other
 alphabet should be invalid entry USING SWITCH STATEMENT  */

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class Pro9 {
    public static void main(String[] args) {
        Pro9 obj = new Pro9();
        obj.switchStatement();
    }

    public void switchStatement() {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter Alphabet between A to F :  ");
        String city = user.nextLine();
        switch (city) {
            case "A":
            case "a":
                System.out.println("Aurangabad");
                break;
            case "B":
            case "b":
                System.out.println("Baroda");
                break;
            case "C":
            case "c":
                System.out.println("Chennai");
                break;
            case "D":
            case "d":
                System.out.println("Dehradun");
                break;
            case "e":
            case "E":
                System.out.println("Edalabad");
                break;
            case "F":
            case "f":
                System.out.println("Florida");
                break;
            default:
                System.out.println("Enter Valid Alphabet");
                user.close();
        }
    }
}
