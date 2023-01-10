import java.lang.*;
import java.util.Scanner;

public class Array2D {
//    Lets talk about 2-D array in java
// 2-D array is array of 1-D array
// matrix is an example of 2-D array
/*
      [[1 2 3],
      [4 5 6],
      [7 8 9]]
    1-D array-->int[]
    2-D array-->int[][]
 */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][];
    //   int[3][] ar={
    //     {1,2,3},
    //     {4,5,6},
    //     {7,8,9}
    //   }
      int[][] ar={{1,2,3},//0th row
                {1,2},//ist row
                {1,2,3,4}//2nd row
            };
      System.out.println(arr.length);//no of rows
      int[][] arr1=new int[3][4];
      for (int i = 0; i < arr1.length; i++) {
        //for each col in every row
         for (int j = 0; j < arr1[i].length; j++) {
            arr1[i][j]=sc.nextInt();
         }
      }
      // in oredr to print the array you can use this approach
      for (int i = 0; i < arr1.length; i++) {
         //for each col in every row
          for (int j = 0; j < arr1[i].length; j++) {
             System.out.print(arr1[i][j]);
          }
          System.out.println();
       } 
   }   
}
