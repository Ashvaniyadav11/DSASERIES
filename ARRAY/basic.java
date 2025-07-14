// create array 
// 1st method of creating array 
import java.util.*;
public class basic {
       public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter value of n :");

        int n = scn.nextInt();

        int[] aarr = new int[n];

        for(int i =0; i <n; i++){
           System.out.println("Enter value of i :"); 
            aarr[i] = scn.nextInt();
        }
        for(int i =0; i <n; i++){
        System.out.println("  :"+aarr[i]);
        }
        //       // second way of creating array when value is known of all index 
              int[] arr = {445,345,5,33434,444};
          for(int i =0; i <arr.length; i++){
            System.out.println("  :"+arr.length);
            System.out.println("  :"+arr[i]);
          }

       }
}