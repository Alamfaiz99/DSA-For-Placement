import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class Swap{
    static void swap1(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void reverse(int[] arr){
        int l=arr.length;
        int[] arr1=new int[l];
        arr1=arr;
        for(int i=1;i<=l;i++){
           arr[i-1]=arr1[l-i];
        }
        System.out.println(Arrays.toString(arr1));
    }
    public static void main(String[] args) {
        int[] arr={1,3,23,9,18};
        swap1(arr,1,3);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }    
}
