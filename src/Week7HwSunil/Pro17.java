package Week7HwSunil;

import java.util.Arrays;

// Write a Java program to sort a numeric array and a string array.
public class Pro17 {
    public static void main(String[] args) {
    Pro17 s = new Pro17();
    s.sort();
    }

    public void sort() {
        int[] number = {156, 654, 455, 963, 745};
        String[] name = {"Prime", "A", "Good", "Testing"};

        System.out.println("Numeric  : " + Arrays.toString(number));
        Arrays.sort(number);
        System.out.println("Numbers Sorted Numerically: " + Arrays.toString(number));

        System.out.println(" Name :  " + Arrays.toString(name));
        Arrays.sort(name);
        System.out.println("Name sorted : " + Arrays.toString(name));

    }
}
