import java.lang.*;
import java.util.Scanner;

// Now lets understand what is rotation in array
// what is first rotationa nd what is nex rottaion
// nums-->array-->sorted
// nums-->[1,2,5,7,9,11]
// first rotaion-->rotation from right hand side
// 11,1,2,5,7,9
// second rotation-->rotation again from right hand side\
// 9,11,1,2,5,7
// in this way array is rotrated
public class Rotationcountinrotatedbs {
    static int findPivot(int[] nums){
        int s=0,e=nums.length-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(m<e && nums[m]>nums[m+1]) return m;
            if(m>s && nums[m]<nums[m-1]) return m-1;
            if(nums[m]<=nums[s]) e=m-1;
            else s=m;
        }
        // array is not rotated
      return -1;
    }
    public static void main(String[] args) {
        int[] nums={9,11,1,2,5,7};
        // if pivot uis not rotated
        int p=findPivot(nums);
        if(p==-1) System.out.println("0");
        else System.out.println("No of rotations:"+(p+1));
    }
}
