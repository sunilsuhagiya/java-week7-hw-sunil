package Week7HwSunil;
//Write a Java program to sum values of an array.
public class Pro18 {
    public static void main(String[] args) {
        Pro18 z = new Pro18();
        z.sum();
    }
    void sum(){
        int value[] = {15, 20, 33, 44, 56, 67, 77,88, 99, 100};
        int sum = 0;

        for (int i : value)
            sum += i;
        System.out.println("The sum is " + sum);
    }
}
