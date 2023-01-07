import java.lang.*;
import java.util.Scanner;

public class FunctionOverloading {
    public static void main(String[] args) {
        fun1(10);
        fun1("faizan");
        // fun2();it will not run and this is known as ambiguity
        // in the function because it will not decide whom to run
    }
    // Two functions with the same name can exit if their parameters are different
    // This is known as function overloading 
    // at compile time it will decide which function will run
    static void fun1(int a){
       System.out.println(a);
    }
    static void fun1(String s){
       System.out.println(s);
    }
    static void fun2(int ...a){

    }
    static void fun2(String ...s){

    }
}
