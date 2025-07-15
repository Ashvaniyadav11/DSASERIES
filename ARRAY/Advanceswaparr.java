// Advance method to swap two elements in an array here which index is given by user
// using function
// create array 
// 1st method of creating array 
import java.util.*;
public class Advanceswaparr {
    public static void  swap(int[] arr, int f , int g){
        int temp = arr[f];
        arr[f] = arr[g];
        arr[g] = temp;
    }
       public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = scn.nextInt();
        int[] num = new int[n];
        int k = n - 1;
        System.out.println("Enter value of index 0 TO "+k );
        int swapK = scn.nextInt();
        System.out.println("Enter value of index second index 0 TO "+k);
        int swapS = scn.nextInt();
        for(int i = 0; i<num.length;i++){
         System.out.println("Enter value of INDEX : " +i);
         num[i] = scn.nextInt();

        }
          swap(num, swapK, swapS);
          for (int i = 0; i<num.length; i++){
            System.out.print(" "+num[i]);
           
          }
       }
}