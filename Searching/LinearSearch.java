import java.lang.*;
import java.security.Key;
import java.util.Scanner;

// Linear Seach Algoritm
/*
  Linear Search:says start searching from the first element till You find the 
  element to be searched.
  arr=[18,12,43,23,54];
  key=12
  whether 12 exist or not
  Time complexity:how much time your algoritm is taking to produce desired output....
  bestcase:O(1);
  worstcase:O(n);-->size of array
  iterate over all the elements but the leemnt didnot found...
  Linear time complexity:
  for n we have to make n comparisions

 */
public class LinearSearch{
    static int linearSearch(int[] arr,int key){
           for(int i=0;i<arr.length;i++){
            if(key==arr[i])
             return i;
           }
           return -1;
    }
    public static void main(String[] args) {
      int[] arr={12,43,5,4,78,345,23};
      int Key=78;
      int ans=linearSearch(arr, Key);
      System.out.println(ans);
   }
}
