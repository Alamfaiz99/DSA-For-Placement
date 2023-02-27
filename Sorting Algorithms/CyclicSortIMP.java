import java.util.Arrays;
// Now we will talk about the cyclic sort
// Thats very important concept
// Questions comes directly in Google,Amazon,Microsoft...
// Sorting algorithm
/*
   3 ,5,2,1,4-->unsorted array
   1)When given nos. from range 1-N-->Then apply cyclic sort-->VVVVVIIP
     Whenever-->range(1-N)-->Apply cyclic sort
     3 5 2 1 4-->unsorted (1-N)
     1 2 3 4 5-->sorted (value=index+1)
     -->in one pass we have to sort the element
     -->means one for loop
     3 5 2 1 4
     is 3 is at correct index-->NO-->swap(0,2)
     2 5 3 1 4
     is 2 is at correct index-->NO-->swap(0,1)
     5 2 3 1 4
     is 5 is at correct index-->NO-->swap(0,4)
     4 2 3 1 5
     is 4 is at correct index-->NO-->swap(0,3)
     1 2 3 4 5
     -->worst case m n-1 swaps

 */
public class CyclicSortIMP {
    public static void swap(int x1,int x2,int[] nums){
        int temp=nums[x1];
        nums[x1]=nums[x2];
        nums[x2]=temp;
    }
    public static void cyclic(int[] nums){
      int i=0;
      while(i<nums.length){
        int correct=nums[i]-1;//-->correct pos of value at i
        if(nums[i]!=nums[correct]) swap(i,correct,nums);
        else i++;
      }
    }
    public static void main(String[] args) {
      int[] nums={2,5,1,3,4};
      cyclic(nums);
      System.out.println(Arrays.toString(nums));
   }    
}
