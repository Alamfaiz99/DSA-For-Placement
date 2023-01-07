import java.util.Scanner;
// What are functions in java?
// A method is a block of code which only runs when it is called. You can pass data, known as parameters, into a method. 
// Methods are used to perform certain actions, and they are also known as functions
// And in order to use the dry principle which is dont repeat Yourself we use functions
// Function are use to do the repetative atsk again and again
/*
    scope return_type name(parameters){
        body of function
    }
 */

public class Functions01 {
    public static int sum(int a,int b){
        return a+b;
    }
    public static void greeting(String name){
        System.out.println("Hello "+name);
    }
    // if we want to swap two numbers
    public static void swap(int a,int b){
        System.out.println("a:"+a+" b:"+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a:"+a+" b:"+b);
    }
    // in this way you can swap the numbers but it will not affect the origiunal number
    // in java only pass by value is present not pass by reference
    // 2)primitives:int ,byte,short,long,double,float
        //   pass by value 
    public static void main(String[] args) {
        // pass the value when you are calling the function
        int s=sum(10,12);
        greeting("faizan");
        System.out.println("Sum of numbers:"+s);
        swap(10,20);
    }
}
