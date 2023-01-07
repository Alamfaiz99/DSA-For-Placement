import java.lang.*;
import java.util.Scanner;
// variables which are declared inside the block are accessible throughout the block
// what is shadowing in java?
// when the lower scope variable showed the upper scope varible then it is known as shadowing
public class Shadowing {
    static int x=90;//scope throughout this block
    static void fun(int x){
        System.out.println(x);
    }
    public static void main(String[] args) {
        System.out.println(x);//90
        // int x=10;//it wil showed the upper variable
         int x;
        //  System.out.println(x);scope willsatrt when the value got initialize
        x=10;//initialized now here the scope starts
        fun(x);//10

    }
}
