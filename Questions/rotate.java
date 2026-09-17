package Questions;
import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
       
        System.out.print("Enter the number of positions to rotate: ");
        int k = sc.nextInt();
        int power = (int) Math.pow(10, k);
        int lastPart = num % power;
        int remainingPart = num / power;
        int digits = 0;
        int temp =  remainingPart;
        while(temp > 0) {
            temp /= 10;
            digits++;
        }
        int result = lastPart * (int) Math.pow(10, digits) + remainingPart;
        System.out.println("Rotated number: " + result);
        sc.close();
    }
}

/* WHAT DID WE LEARN?
Never work with a variable directly when you have to access its original value in results
and you have to perform any operation on it during the code.
Always assign a temporary variable to the original variable and perform operations on it.
*/