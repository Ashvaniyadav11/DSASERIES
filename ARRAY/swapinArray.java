// This code swaps the first two elements of an array and prints the swapped elements. 
import java.util.*;
public class basic {
    public static void  swap(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        }
       public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
         int[] arr = {23,56};
          swap(arr);
           for(int i = 0; i<arr.length;i++){
            System.out.println("Swap element : " +arr[i]);
              }
        
       }
}

//Array across function are always connected.Beacuse when initialised in main function,
// it is passed by reference. then value is stored in heap memory.