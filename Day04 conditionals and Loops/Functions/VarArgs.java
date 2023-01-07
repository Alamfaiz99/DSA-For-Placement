import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
// Here varargs stands for variable arguments
// means You dont know hoe many argument youy will pass to the function

public class VarArgs {
    public static void main(String[] args) {
        // print1(10,20,30,403,12);
        print1();
        multiple(10, 20, "10","20","30","40","50");
        // with the varargs we are passing array
    }
    static void print1(int ...a){
        System.out.println(Arrays.toString(a));
    }
    // one more important concept is that variable arguments will come at the last
    // of the argument list
    // You have to keep thsi thing in your mind
    static void multiple(int a,int b,String ...s){
      System.out.println(a);
      System.out.println(b);
      System.out.println(Arrays.toString(s));
    }
}
