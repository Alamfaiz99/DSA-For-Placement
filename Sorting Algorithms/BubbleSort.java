import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
//    Lets write code for buuble sort
    static void bubbleSort(int[] nums){
    //   This is for no of passes 
    // This is comparision based sorting so time complexity
    // in Best case:O(N)
    // in worst case:O(N^2)  
      for(int i=0;i<nums.length-1;i++){
        //  for no of comparisions swapping
        int swap=-1;
        for(int j=1;j<=(nums.length-1-i);j++){
             if(nums[j]<nums[j-1]){
                nums[j]=nums[j]^nums[j-1];
                nums[j-1]=nums[j]^nums[j-1];
                nums[j]=nums[j]^nums[j-1];
                swap++;
             }
        }
        // if no swapping means algo is already sorted
        if(swap==-1) break;
      }
    }
    public static void main(String[] args) {
     int[] nums={4,16,24,76,1,2,6,8};
     bubbleSort(nums);
     System.out.println(Arrays.toString(nums));
   }    
}
