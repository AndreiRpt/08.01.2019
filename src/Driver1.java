/**1. Write a static method of type void that takes a String value as a formal parameter, if the string has
 //more than 12 characters, the method should print the message:
 //"The value is too big", else it should return "Success"
 //The string value be entered by the user using the Scanner class in the main method.
 //To get the number of characters of a String you should use the method of String class length() (e.g.
 //value.length())
 // public static void checkStringLength(String value) {
 // // write your code here
 //}
 //Test your solutions in the main method.
 */
import java.util.Scanner;

public class Driver1 {

    public static void checkStringLength(String value) {

        if (value.length()>12) {
            System.out.println ("The value is too big! " + "The value has " + value.length() + " characters! Should be less with " + (value.length()-12) +" characters!");
        }
        else {
            System.out.println ("Success! " + "The value has " + value.length() + " characters");
        }
    }

    public static void main (String [] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value: ");
        String value = scan.next();

        checkStringLength (value);
    }



}