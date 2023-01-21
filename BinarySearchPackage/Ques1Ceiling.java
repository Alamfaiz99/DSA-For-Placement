import java.lang.*;
import java.util.Scanner;

// Approach to apply binary search/When
// -->When u will get sorted array apply binary search
/*
   When to apply Binary Search?
   1)When u will get sorted array apply binary search(95% sol)
   2)req 1 ans-->follow continuous seq to get that ans..-->same seq-->apply binary search(sqrt of number)
   3)
 */
// Question1-->Find ceiling of target element
// ar[2,3,5,9,14,16,18]-->sorted -->binary search
// target=14-->ceiling
// smallest element in array which is equal to or larger than target element
public class Ques1Ceiling {
    static int ceiling(int[] ar,int target){
        int s=0,e=ar.length-1;
        // if target element is greater than the greatest element
        // Then there wil be no ceiling
        if(target>ar[e]){
          System.out.println("No Ceiling");
          return -1;}
        else{
        while(s<=e){
            int m=s+(e-s)/2;
            if(ar[m]==target)
              return ar[m];
            else if(target>ar[m])
              s=m+1;
            else
              e=m-1;
        }}
        return ar[s];
    }
    public static void main(String[] args) {
        int[] ar={2,3,5,9,14,16,18};
        int target=19;
        int ans=ceiling(ar,target);
        System.out.println("Ceiling:"+ans);
    }
}
