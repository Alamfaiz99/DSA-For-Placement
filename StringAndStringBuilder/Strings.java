import java.lang.*;
import java.util.Scanner;

// Today we will talk about strings
/*
 * Strings-->non primitive data structure
 * Because we can further divide the strings into chars
 * Strings are immutable datastructure because you cannot change the value of 
 * string at the same memory location
 * String-->stream of characters
 * Most commonly used class in java class library
 * String a="kunal"  a-->          String pool
 *                             --->"kunal"
 * String b="kunal"  b-->
 * Concept:1)String pool-->make our program more optimized
 *         2)Immutable-->for sequrity purpose it is immutable
 *                       password,
 *          Now lets say p1,p2,p3,p4-->"kunal"
 * if 1 person changes his name thats why it is immutable
 */
public class Strings {
   public static void main(String[] args) {
     int[] arr={1,2,3,4,5};//arr-->reference var in the stack
                           //object is created in the heap
     int a=10;//a-->rfernce var 10-->object in the heap
     String name="Faizan";//name-->ref var && "faizan"-->obj in the heap
     System.out.println(name);
    //  Les create two reference var pointing towards the same object
    String name1="Faizan";
    String name2="Faizan";
    // hashcode-->is use to get the address of string object 
    System.out.println("name1:"+name.hashCode()+"name2:"+name2.hashCode());
   }    
}
