import java.util.Arrays;
import java.util.Scanner;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        int[] ar={1,2,3,45,6};
        change(ar);
        System.out.println(Arrays.toString(ar));
    }
    // ar-->[1,2,3,45,6]
    // nums-->[1,2,3,45,6]
    // nums[0]=10
    // strings are  immutable datatypes
    // array is mutable datatype
    static void change(int[] nums){
       nums[0]=10;
    }
}
