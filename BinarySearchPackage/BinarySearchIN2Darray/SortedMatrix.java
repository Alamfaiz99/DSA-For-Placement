import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

// What is sorted matrix
// sorted matrix means it is sorted in row wise and column wise mannner
// Q:Search in a sorted matrix
// Strictly sorted array
// {{1,2,3},
//  {4,5,6},
//  {7,8,9}}
// the above is strictly sorted array
// Here first element of row is always greater than the last element of previous row
// Strictly sorted matrix
// rs=0 and re=n-1
// m=rs=(re-rs)/2
// seach for the element
// if element==target return ans
// if element > target //ignore previous rows
// if element <target  ignore next rows

public class SortedMatrix {
    // search in the row provided between cs and re
    static int[] binarySearch(int[][] nums,int row,int cs,int ce,int target){
      while(cs<=ce){
        int m=cs+(ce-cs)/2;
        if(target==nums[row][m]) return new int[]{row,m};
        if(target>nums[row][m]) cs=m+1;
        else ce=m-1;
      }
      return new int[]{-1,-1};
    }
   static int[] search(int[][] mat,int target){
    // here we are searching in rows
    // in strictly sorted matrix 
     int rows=mat.length;
     int cols=mat[0].length;
    //  if rows 1
    int rStart=0;
    int rEnd=rows-1;
    int cMid=cols/2;
    if(rows==1) return binarySearch(mat, 0, 0, mat.length-1, target);
    // now run the loop till two row are remaining
     while(rStart<(rEnd-1)){//for two rows
        // WHie true it will have more than two rows
        int mid=rStart+(rEnd-rStart)/2;
        if(mat[mid][cMid]==target) return new int[]{mid,cMid};
        if(mat[mid][cMid]<target)  rStart=mid;
        else rEnd=mid; 
     }
    //  NOw we have tow rows
    // check whether the middle element is getting the answer or not
    if(mat[rStart][cMid]==target) return new int[]{rStart,cMid};
    if(mat[rStart+1][cMid]==target) return new int[]{rStart+1,cMid};
    // otherwise search in first half
    if(target<=mat[rStart][cMid-1]) return binarySearch(mat, rStart, cMid-1, rStart, target);
    // search in second half
    if(target>=mat[rStart][cMid+1]) return binarySearch(mat, rows, rEnd, cMid, target);
    // search in third  half
    if(target<=mat[rStart+1][cMid-1]) return binarySearch(mat, rows, rEnd, cMid, target);
    // search in fourth half
    if(target<=mat[rStart+1][cMid+1]) return binarySearch(mat, rows, rEnd, cMid, target);
   }
   }
     public static void main(String[] args) {
       int[][] mat={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
      System.out.println(Arrays.toString(search(mat, 9)));    
   }    
}
