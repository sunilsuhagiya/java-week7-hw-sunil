package Week7HwSunil;
/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
        any other alphabet should be invalid entry*/

import java.util.Scanner;

public class Pro8 {
    public static void main(String[] args) {
    Pro8 obj = new Pro8();
    obj.unit();
    }
    public void unit() {

        Scanner data = new Scanner(System.in);
        System.out.println("Enter Alphabet between A to F :  ");
        char name = data.nextLine().charAt(0);

        if (name == 'a' || name == 'A') {
            System.out.println("Aurangabad");
        } else if (name == 'B' || name == 'b') {
            System.out.println("Baroda");
        } else if (name == 'C' || name == 'c') {
            System.out.println("Chennai");
        } else if (name == 'D' || name == 'd') {
            System.out.println("Dehradun");
        } else if (name == 'E' || name == 'e') {
            System.out.println("Edalabad");
        } else if (name == 'F' || name == 'f') {
            System.out.println("Florida");
        } else {
            System.out.println("Enter Valid Alphabet");
            data.close();
        }


    }

}
