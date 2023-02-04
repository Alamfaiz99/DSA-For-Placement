import java.lang.*;
import java.util.Scanner;
// Lets code Binary Search
class BinarySearch{
    static int binarySearch(int[] ar,int target){
        int s=0,e=ar.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(ar[m]==target){
                return m;
            }
            else if(target>ar[m]){
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int[] ar={12,19,45,67,90};//array must be sorted
        int target=12;
        int i=binarySearch(ar,target);
        System.out.println("Index:"+i);
    }
}
// Today we will talk about Binary Seach-->IMP
/*
  VVIP Topic -->Binary search
  Binary search is used fo sorted arrays..
  ar=[10,12,32,56,78]-->sorted array
  ar=[-2,32,56,21,45,754,434]-->unsorted array
  ar=[2,4,6,9,11,12,14,20,36,48];
  target=36-->is present in the array or not
  Binary search says-->take middle of the array
  1)Find the middle element
  2)target>middle-->search in right
  3)target<middle-->search in left
  4)id middle==target-->return index of middle//ans
  take two pointers
  s-->start
  e-->end
  m=(s+e)/2;
  Best case of binary search=m-->when middle element is equal to the target element
  at the very first step O(1).
  if(s>e):means element not found
  Why Binary search?



 */