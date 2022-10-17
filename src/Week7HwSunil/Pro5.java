package Week7HwSunil;
/* WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
 HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF */
import java.util.Scanner;

public class Pro5 {
    public String employeeID;
    private  String employeeName;
    private int salary,HRA,DA,TA,PF,Grosssalary;
    public void data (){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        employeeID=scan.next();
        System.out.println("Enter Employee Name: ");
        employeeName=scan.next();
        System.out.println("Enter Your Salary:  ");
        salary=scan.nextInt();

        }
    public void cal(){
        HRA= (10*salary)/100;
        DA = (8*salary)/100;
        TA = (9*salary)/100;
        PF = (20*salary)/100;
        Grosssalary = salary + HRA +DA + TA - PF;
    }
    public void output(){
        System.out.println("---------------------------------------------");
        System.out.println("|           Salary Slip                     |");
        System.out.println("|___________________________________________|");
        System.out.println("| Employee ID            :  "+employeeID+"              |");
        System.out.println("| Employee Name          :  "+employeeName+"           |");
        System.out.println("|___________________________________________|");
        System.out.println("| Basic Salary           :   "+salary+"          |");
        System.out.println("| HRA 10%                :   "+HRA+"           |");
        System.out.println("| TA 8%                  :   "+TA+"           |");
        System.out.println("| DA 9%                  :   "+DA+"           |");
        System.out.println("| PF -20 &               :   "+PF+"           |");
        System.out.println("|___________________________________________|");
        System.out.println("| Gross Salary           :   "+Grosssalary+"          |");
        System.out.println("|===========================================|");
    }

    public static void main(String[] args) {
        Pro5 obj=new Pro5();
        obj.data();
        obj.cal();
        obj.output();
    }
}
