import java.lang.*;
import java.util.Scanner;

// Infinite array problem in which u don't know the length of array
// means u cant use array.length
// But array is sorted -->u can apply Binary search
// Now we have to use the opposite concept of binary search
// we have to grow the array
// 1 2 3 4 5 6 7 8 9 10
// s e
//     s        e
//                s              e
// s=e+1
// e=e+(e-s+1)*2;
public class Ques3InfiniteArray {
    static int binarySearch(int ar[],int target,int start,int end){
      while(start<=end){
        int m=start+(end-start)/2;
        if(ar[m]==target)
            return m;
        else if(target>ar[m])
           start=m+1;
        else
           end=m-1;
      }
      return -1;
    }
    static int ans(int[] ar,int target){
        int start=0;
        int end=1;
        while(target>ar[end]){
            int temp=end+1;
            // length of array in multiples of 2 reverse of binary search
            end=end+(end-start+1)*2;
            start=temp;

        }
        int ans=binarySearch(ar, target, start, end);
        return ans;
    }
    public static void main(String[] args) {
        int[] ar={1,3,5,7,9,23,45,67,89,123,456,789,2000,4045};
        int target=2000;
        int i=ans(ar, target);
        System.out.println("Index:"+i);
   }    
}
