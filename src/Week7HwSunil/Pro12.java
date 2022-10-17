package Week7HwSunil;

import java.util.Scanner;

// Write a program that tells us input value is number or an alphabet or symbol.
public class Pro12 {
    public static void main(String[] args) {
      Pro12 y = new Pro12();
      y.value();
    }
    public void value(){
        Scanner n = new Scanner(System.in);

        System.out.println("Enter any character : ");
        char ch = n.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

            System.out.println(ch + " is A Alphabet.");

        } else if(ch >= '0' && ch <= '9') {

            System.out.println(ch + " is A Number.");

        } else {

            System.out.println(ch + " is A Character.");
        }
        n.close();
    }
}
