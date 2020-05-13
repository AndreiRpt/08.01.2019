/**
 * 4. Write a static method of type void that takes an int variable as formal parameter. If the int variable
 * has value 1 print the value “Monday”, if it has value 2 print the value “Tuesday” and so on, so we can
 * display all the days of the week based on numbers from 1 to 7. If the number is not in the range 1-7,
 * then print the message “Invalid day number!”.
 * The int value should be entered by the user using the Scanner class in the main method.
 * public static void getDay(int dayNumber) {
 * // write your code here
 * }
 * Test your solutions in the main method.
 */

import java.util.Scanner;
public class Driver4 {
    public static void getDay(int dayNumber) {
        switch (dayNumber) {
            case 1: System.out.println("Monday!");
                break;
            case 2: System.out.println("Tuesday!");
                break;
            case 3: System.out.println("Wednesday!");
                break;
            case 4: System.out.println("Thursday!");
                break;
            case 5: System.out.println("Friday!");
                break;
            case 6: System.out.println("Saturday!");
                break;
            case 7: System.out.println("Sunday!");
                break;
            default: System.out.println("Invalid day format!");
        }
    }

    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int dayNumber = scan.nextInt();
        getDay(dayNumber);

    }

}
