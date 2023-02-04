import java.util.Arrays;
import java.util.Scanner;
// Now lets talk about the insertion sort
// In insertion sort we put elements into sorted parts
// It is also comparision based sorting
public class InsertionSort {
    static void insertionSort(int[] nums){
        // For the number of passes
        for(int i=1;i<nums.length;i++){
            int j=i-1;
            int temp=nums[i];
        // For comparision of elements
          for(;j>=0;j--){
             if(nums[j]>temp) nums[j+1]=nums[j];
             else break;
          }
          nums[j+1]=temp;
        }
    }
   public static void main(String[] args) {
    int[] nums={2,5,3,5,8,25,34,12,98,34};
    insertionSort(nums);
    System.out.println(Arrays.toString(nums));
   }    
}
