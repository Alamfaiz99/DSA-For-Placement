import java.lang.*;
import java.util.Scanner;
// Order Agnostic Binary search
// is  binary search in which u dont know whether the element is sorted in
// in ascending or decending order
// We have to check whether the element is sorted in ascending or decending order
// if(ar[s]<ar[e])-->ascending order sorted
// else decending order sorted
// agnostic-->means u dont know
public class OrderAgnosticBinarySearch {
   static int OrderAgnosticBinarySearch(int[] ar,int target){
    //  Either it is sorted in ascending order or decending order
    int s=0,e=ar.length-1;
    if(ar[s]<ar[e]){
        System.out.println("Ascending order sorted.");
        while(s<=e){
        int m=s+(e-s)/2;
        if(target==ar[m])
           return m;
        else if(target>ar[m])
           s=m+1;
        else
           e=m-1;
       }
       return -1;
    }
    else{
        System.out.println("Descending order sorted.");
        while(s<=e){
            int m=s+(e-s)/2;
            if(target==ar[m])
               return m;
            else if(target>ar[m])
               e=m-1;
            else
               s=m+1;
           }
           return -1;
        }}
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int[] ar={1,4,7,9,23,54,80,450,980};
     int target=80;
     int i=OrderAgnosticBinarySearch(ar, target);
     System.out.println("Index:"+i);
   }}
