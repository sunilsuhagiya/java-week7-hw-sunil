package Week7HwSunil;
/*Write a java program input sales id, seller's name, sales amount, and salary basic and
then find this sales Commission
Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2% */

import java.util.Scanner;

public class Pro7 {

    public static void main(String[] args) {
        comm();
    }

    public static void comm() {
        double salesID, salesAmount, basic, commission = 0.0, commissionRate;
        String sName;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sales ID :  ");
        salesID = scanner.nextInt();
        System.out.println("Enter Seller's Name: ");
        sName = scanner.next();
        System.out.println("Enter Sales Amount:  ");
        salesAmount = scanner.nextDouble();
        if (salesAmount >= 50000) {
            commissionRate = 35;
            commission = salesAmount * 0.35;
        } else if (salesAmount >= 30000) {
            commissionRate = 20;
            commission = salesAmount * 0.20;
        } else if (salesAmount >= 20000) {
            commissionRate = 10;
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 10000) {
            commissionRate = 5;
            commission = salesAmount * 0.05;
        } else if (salesAmount < 10000) {
            commissionRate = 2;
            commission = salesAmount * 0.02;
        }
        System.out.println("Your Commission is: " + commission);


    }
}
