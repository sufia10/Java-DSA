package Questions;
import java.util.Scanner;

public class inverse {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of elements: ");
         int num = sc.nextInt();
         int arr[] = new int[num];
         System.out.println("Enter the elements of the array: ");
         for (int i=0; i<num; i++){
             arr[i] = sc.nextInt();
         }

         int inv[] = new int[arr.length +1];
         for (int i=0; i<arr.length; i++){
             inv[arr[i]] = i+1;
         }
         System.out.println("The inverse of the array is: ");
         for (int i=1; i<inv.length; i++){
             System.out.print(inv[i] + " ");
         }

         sc.close();
    }
}



