import java.lang.*;
import java.util.Scanner;

// Floor of target
// largest element in array <= target element
// if target<smallest element-->no Floor

public class Ques2Floor {
    static int floor(int[] ar,int target){
        int s=0,e=ar.length-1;
        // since array is sorted we have to apply binary search
        if(target<ar[s]){
            System.out.println("No Floor..");
            return -1;
        }
        while(s<=e){
            int m=s+(e-s)/2;
            if(ar[m]==target)
              return ar[m];
            else if(target>ar[m])
              s=m+1;
            else
              e=m-1;
        }
        return ar[e];
    }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int[] ar={2,3,5,9,14,16,18};
    int target=4;
    int res=floor(ar,target);
    System.out.println("Floor:"+res);

  }    
}
