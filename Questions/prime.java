package Questions;

import java.util.Scanner;

/*
This file contains the java program to check whether the given number is prime or not.
*/

public class prime{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        boolean isPrime=true;

        for (int i=2; i<=num; i++){
            if (num%i==0 && num ==i){
                isPrime=true;
                break;
            }
            else {
                isPrime=false;
            }
        }
        if (isPrime){
            System.out.println(num + " is a prime number.");
        }
        else {
            System.out.println(num + " is not a prime number.");
        }
        sc.close();
    }
    }
