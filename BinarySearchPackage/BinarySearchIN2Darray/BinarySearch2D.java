import java.util.Arrays;
import java.util.Scanner;

// Now we will talk about BInary Search in 2D array
// here row and col both are sorted thats why we are applying binary search
// When you ahve given a large search space then we have to minize the search space in 
// order the find out the answer
// Thats what we will do in sorted matrix
// we will take lower bound and upper bound
// lower bound-->r1(00)
// upper bound-->clast(n-1)(0n-1)
// Now we have to make comparisions

// Binary search
// lower bound-->r1(00)
// upper bound-->col(n-1)
// 1)case-->if element==target -->element found
// 2)case-->if target>element-->r++;
// 3)case-->if target<element-->c--;
// Time complexity is O(n)
// n-->row+n-->col traversal and reducing the search space


public class BinarySearch2D {
    static int[] search(int[][] mat,int target){
        int r=0;//-->0
        int c=mat[0].length-1;//-->n-1
        // Now we have to apply condition
        while(r<mat.length && c>=0){//r<n and col>=0
           if(target==mat[r][c]) return new int[]{r,c};
           if(target<mat[r][c]) c--;
           if(target>mat[r][c]) r++;
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[][] mat=new int[][]{{1,2,3},
                     {5,7,9},
                     {8,10,16}};
        int target=9;
        int[] ans=search(mat, target);
        System.out.println("Ans:"+Arrays.toString(ans));
    }
}
