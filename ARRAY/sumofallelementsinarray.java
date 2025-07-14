
// 1st method of creating array 
import java.util.*;
public class sumofallelementsinarray {
       public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        // sum of array   
        // Read an array of N length and print the sum of all elements
        System.out.println("Enter value of n :");
        int n = scn.nextInt();
        int[] arr = new int[n];
        int sum =0;
         for(int i = 0; i<arr.length; i++){
           System.out.println("INDEX : " +i);
            arr[i] = scn.nextInt();
         
            }
           for(int i =0; i<n; i++){
             sum = sum + arr[i];
            }

     System.out.println("Total sum of Array Elements is : " +sum);   
        
       }
}