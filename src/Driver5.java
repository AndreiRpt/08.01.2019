import java.util.Scanner;

/**
 * 5. Write a static method of type void that takes an array of type double as formal parameter. The
 * method will calculate and print the average value (sum/array.length()) of all the numbers inside the
 * array.
 * public static void printAverageValue(double [] arr) {
 * //write your code here
 * }
 * Test your solutions in the main method.
 */

public class Driver5 {

    public static void printAverageValue(double [] arr) {
        double  sum = 0;
        for (int i= 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        double average= sum/arr.length;
        System.out.println(average);
    }

    public static  void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value 1: ");
        int value1 = scan.nextInt();

        System.out.println("Enter the value 2: ");
        int value2 = scan.nextInt();

        System.out.println("Enter the value 3: ");
        int value3 = scan.nextInt();

        System.out.println("Enter the value 4: ");
        int value4 = scan.nextInt();

        double [] arr = {value1, value2, value3, value4};

        printAverageValue(arr);

        //fara scanner
//        double [] arr = {1,2,3,5};
//        printAverageValue(arr);


    }
}






