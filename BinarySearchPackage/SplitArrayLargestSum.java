import java.lang.*;
import java.util.Scanner;
public class SplitArrayLargestSum {
    static int sum(int[] nums){
        int s=0;
        for(int i=0;i<nums.length;i++) s+=nums[i];
        return s;
    }
    static int max(int[] nums){
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]) max=nums[i];
        }
        return max;
    }

    static int splitArray(int[] nums,int k){
        //if k==1 means split array into 1 part
        // ans -->sum of all elements
        if(k==1) return sum(nums);
        if(k==nums.length) return max(nums);
        int s=max(nums);
        int e=sum(nums);
        if(k>1){
            while(s<e){
                // try the middle as potential answer
                int m=s+(e-s)/2;
                // calculate how many pieces you can divide it using max sum
                int sum=0,p=1;
                for(int num:nums){
                    if(sum+num>m){
                        // you cannot add to this sum
                        // say you want to add that sum in new subarrray sum will become sum=num
                        sum=num;
                        p++;
                    }
                    else{
                        sum+=num;
                    }
                }
                if(p>k) s=m+1;
                else e=m;
            }
            return e;
        }
        return e;
    }
    public static void main(String[] args) {
        int[] numss={2,34,1,24,56,1};
        int ans=splitArray(numss, 2);
        System.out.println("Largest sum:"+ans);        
    }
}
