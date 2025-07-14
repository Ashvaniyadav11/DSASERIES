 //variable of two function are not connected ( variable not across function )
// variable swapping in java


import java.util.Scanner;
public class basic {
    public static void swap(int a, int b){
        int temp = a;
             a = b;
             b= temp;
             
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Hello Ashvani Yadav");
         int n = 34;//scn.nextInt();
          int m =67;//  scn.nextInt();
         
           swap(n,m);
         System.out.println("your swap number is :"+n);
         System.out.println("your swap number is :"+m);

    }
}