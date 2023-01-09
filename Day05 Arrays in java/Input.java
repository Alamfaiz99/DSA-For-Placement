import java.lang.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in); 
    // This is array of primitives
    int[] arr=new int[5];//dec and creation of object
    //  arr[0]=23;
    //  arr[1]=35;
    //  arr[2]=53;
    //  arr[3]=12;
    //  arr[4]=13;
    //  System.out.println(arr[4]);
    //  if we ahve a lot of data then we can use for loop
     for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
     }
    //  Third way to print array and most impressive way
     System.out.println(Arrays.toString(arr));
     //    we have enhanced for loop
     for(int item : arr){
        System.out.print(item+" ");
     }
    //  Array of objects
    String[] str=new String[4];
    for (int i = 0; i < str.length; i++) {
        str[i]=sc.next();
    }
    // modify
    str[2]="faizan";
    System.out.println(Arrays.toString(str));
   }    

}
