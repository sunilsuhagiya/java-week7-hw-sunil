package Week7HwSunil;

import java.util.Scanner;

/* Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 */
public class Pro3 {
    public static void main(String[] args) {
        data();
    }

    public static void data() {
        int math, science, english, total, rollNo;
        String result=null, grade=null, name;
        double percentage;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your First Name:    ");
        name = in.nextLine();
        System.out.println("Enter Your Roll No:   ");
        rollNo = in.nextInt();
        System.out.println("Enter Math Marks:    ");
        math = in.nextInt();
        System.out.println("Enter Science Marks:   ");
        science = in.nextInt();
        System.out.println("Enter English Marks:    ");
        english = in.nextInt();
        total=math + science + english;
        int per;
        per=total/3;
        System.out.println("Your Marks is :  " +total);
        System.out.println("Your Percentage is :  " +per);

        if (per >= 80){
            grade = "A+";
            System.out.println("Grade is: " +grade);
        } else if (per>=60) {
            grade = "A";
            System.out.println("Grade is: " +grade);
        } else if (per>=50) {
            grade = "B";
            System.out.println("Grade is: " +grade);
        }else if (per>= 35){
            grade = "C";
            System.out.println("Grade is: " +grade);
        }if (per>=35){
           result = "PASS";
        }else {
            result = "FAIL";
        }
        System.out.println("----------------------------------------");
        System.out.println("|                                      |");
        System.out.println("|           Mark Sheet                 |");
        System.out.println("|______________________________________|");
        System.out.println("|     Name       :   " + name + "             |");
        System.out.println("|     Roll No    :   " + rollNo + "                |");
        System.out.println("|______________________________________|");
        System.out.println("|     Subject    :    Marks            |");
        System.out.println("|______________________________________|");
        System.out.println("|     Math       :    " + math + "               |");
        System.out.println("|     Science    :    " + science + "               |");
        System.out.println("|     English    :    " + english + "               |");
        System.out.println("|______________________________________|");
        System.out.println("|     Total      :    "+ total +"              |");
        System.out.println("|______________________________________|");
        System.out.println("|     Percentage :    "+ per +"               |");
        System.out.println("|     Result     :    "+ result +"             |");
        System.out.println("|     Grade      :    "+grade +"                |");
        System.out.println("|______________________________________|");
    }


    }


