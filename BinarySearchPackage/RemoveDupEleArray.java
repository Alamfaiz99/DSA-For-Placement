import java.lang.*;
import java.util.Scanner;

public class RemoveDupEleArray {
    public static void main(String[] args) {
        if(nums.length==0) return 0;
        int j=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]!=nums[j])
              nums[++j]=nums[i];
        }
        return ++j;
              
    }
}
