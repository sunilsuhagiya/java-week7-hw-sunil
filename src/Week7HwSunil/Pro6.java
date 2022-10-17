package Week7HwSunil;

import java.util.Scanner;

//Write a java program to input any number and find out if it’s odd or even
public class Pro6 {
    public static void main(String[] args) {
        int number;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        number = s.nextInt();
        if(number % 2 == 0)
        {
            System.out.println("The given number "+number+" is Even ");
        }
        else
        {
            System.out.println("The given number "+number+" is Odd ");
        }
    }
}

