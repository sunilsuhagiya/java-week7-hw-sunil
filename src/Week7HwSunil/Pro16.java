package Week7HwSunil;

import java.util.Scanner;

//Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
public class Pro16 {
    public static void main(String[] args) {
        Pro16 x = new Pro16();
        x.enter();
    }
    public void enter(){
        int number;
        Scanner z = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        number = z.nextInt();
        z.close();
        if(number > 0)
        {
            System.out.println(number+" is positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is negative number");
        }
        else
        {
            System.out.println(number+" is Zero");
    }
        z.close();
}
}
