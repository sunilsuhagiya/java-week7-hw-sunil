package Week7HwSunil;
// Write a Java program to test if an array contains a specific value
public class Pro20 {
    public static boolean contains(int[] arr, int item) {
        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] myarray1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};
        System.out.println(contains(myarray1, 2013));
        System.out.println(contains(myarray1, 2015));
    }
}
