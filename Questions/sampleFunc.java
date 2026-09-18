package Questions;
import java.util.Scanner;

public class sampleFunc {

    static int square(int n) {
        return n * n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");   
        int n = sc.nextInt();
        int result = square(n);
        System.out.println("The square of " + n + " is: " + result);
        sc.close();
            }

    }
