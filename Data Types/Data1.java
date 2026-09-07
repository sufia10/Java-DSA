
import java.util.Scanner;

public class Data1 {
    public static void main(String[] args){
        System.out.println("We are learning Data Types in Java");

        Scanner input = new Scanner(System.in); //constructor of Scanner class
        int num = input.nextInt(); //taking input from user
        System.out.println("The number you entered is: " + num); //printing the input number
        input.close(); //closing the scanner object

        String s = "Hello, DSA!";
        System.out.println(s);
    }
}
