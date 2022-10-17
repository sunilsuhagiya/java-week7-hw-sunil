package Week7HwSunil;
//Write a Java program to calculate the average value of array elements.
public class Pro19 {
    public static void main(String[] args) {
    Pro19 t = new Pro19();
    t.avg();
    }
    public void avg(){
        int element[] = {20,30,40,50,60,70};
        int avg = 0;

        for (int i = 0; i< element.length; i++)
            avg = avg + element[1];
        double average = avg/element.length;
        System.out.println("Average value is : " +average);
    }
}
