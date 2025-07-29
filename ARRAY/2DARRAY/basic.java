import java.util.Scanner;
public class shyam{
    public  static void main(String args[]){
        Scanner scn = new Scanner(System.in);
         // taking input creating 2d array
        System.out.println("Enter ROW value  n :");
        int n = scn.nextInt();
        System.out.println("Enter COLUMN value  m :");
        int m = scn.nextInt();

        int[][] mat = new int[n][m];

        for(int i = 0; i<mat.length; i++){
           
            for(int j = 0; j<mat[0].length; j++){
                System.out.println("Indexes is :" +i +" "+j);
                mat[i][j] = scn.nextInt();
            }
        }
        for(int j = 0; j<5; j++){
            
            for(int i = 0; i<4; i++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
         }


         // creating Array 2D array without taking input
         int[][] arr = {
                  {12,43,56,58},
                  {34,12},
                  {23,89,90,97,99,56,34}
         };
    }
}