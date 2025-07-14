// Advance method to swap two elements in an array here which index is given by user
import java.util.*;
public class basic {
    public static void  swap(int[] arr, int f , int g){
        int temp = arr[f];
        arr[f] = arr[g];
        arr[g] = temp;
    }
       public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = scn.nextInt();
         int[] arr = new int[n];
         System.out.println("Enter first index which you want to swap  : ");
         int swapK = scn.nextInt();
         System.out.println("Enter Secondindex which you want to swap  : ");
         int swapS = scn.nextInt();
         for(int i =0; i<arr.length; i++){
            System.out.println("Enter value of index : "+i);
            arr[i] = scn.nextInt();
        }
          swap(arr,swapK,swapS);
           for(int i = 0; i<arr.length;i++){
            System.out.println("Swap element : " +arr[i]);
              }
        
       }
}