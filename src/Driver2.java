/**2.  Write a static method of type void that takes a int value as a formal parameter and print the text
 //“Positive”(e.g. 1) if it is positive or “Negative”(e.g. -1) if it is negative. If the number entered is 0 the
 //method should print “Zero”
 //The int value should be entered by the user using the Scanner class in the main method.
 //public static void checkPosNegInt(int value) {
 // // write your code here
 //}
 //Test your solutions in the main method.
 */

import java.util.Scanner;

public class Driver2 {

    public static void checkPosNegInt(int value) {

        if (value < 0) {
            System.out.println("The value is Negative");
        }
        else if (value > 0) {
            System.out.println ("The value is Positive");
        }
        else {
            System.out.println("The value is Zero");
        }
    }

    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int value = scan.nextInt();

        checkPosNegInt(value);
    }


}



