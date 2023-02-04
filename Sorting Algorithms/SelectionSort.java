import java.lang.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

// Now we will talk about selection sort
// It is also comparision based sorting
// First loop-->passes
// Second loop for comparision
// We have to select largest/smallest element and put at correct index
public class SelectionSort {
    static void selectionSort(int[] nums){
        // First loop for passes (n-1)
        int j=1;
        for(int i=0;i<nums.length-1;i++){
            // second loop to find the largest/smallest element
            // Here we find the largets element
            int last=nums.length-i-1;
            int max=0;
            for(j=1;j<nums.length-i;j++){
                if(nums[j]>nums[max])  max=j;
            } 
            nums[last]=nums[last]^nums[max];
            nums[max]=nums[last]^nums[max];
            nums[last]=nums[last]^nums[max];
            
        }
    }
   public static void main(String[] args) {
    int[] nums={3,4,6,2,3,6,8,9,12,34};
    selectionSort(nums);
    System.out.println(Arrays.toString(nums));
   }    
}
