/**3.  Write a static method of type void that takes as formal parameters two numbers from the user and
 * prints the greatest number.
 * The int values should be entered by the user using the Scanner class in the main method.
 * public static void printGreatest(int a, int b){
 * write your code here }
 * Test your solutions in the main method.
 */

import java.util.Scanner;

public class Driver3 {

    public static void printGreatest (int a, int b ) {

         if (a > b) {
            System.out.println ( "The number "  + a +  " is the greatest" );
        }
        else if (a < b) {
            System.out.println ("The number " + b + " is the greatest");
        }
        else {
            System.out.println ("Enter different numbers please!");
        }
    }

    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value for 'a': ");
        int a = scan.nextInt();
        System.out.print("Enter the value for 'b': ");
        int b = scan.nextInt();
        printGreatest(a,b);
    }

}
