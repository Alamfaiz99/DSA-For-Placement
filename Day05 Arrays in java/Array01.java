import java.lang.*;
import java.util.Scanner;

// Today we will talk about Arrays in java
// Q:store roll no:
// int roll=10;
// Q:store name
// String name="faizan"
// store 10 roll no:
// then that will be very tedeous task and here we have to use dry principle 
// wich says dont repeat yourself
// Thats why array came intoexistance to store similar datat in a contiguous memory location
// so that you can easily access those data and it will be organized.

// Syntax of array
// datatype[] variable_name=new datatype[size];

public class Array01 {
    public static void main(String[] args) {
                //  store 5 roll nos
                int[] roll=new int[5];
                // roll={10,20,30,40,50};you cant use like this
                // directly u can write
                int[] rolls={10,20,30,40,50};
                int[] rol;//declaration of array-->it will got defined in stack
                rol=new int[5];//object creation in te heap
                // int[]       arr         =     new int[5];
                // datatype    refvar              object creation in heap
                // compile time                     run time
                //                      Dynamic memory allocation means memory is allocated during run tim 
     /*
         In java there is no concept of pointers 
         thats why memory location is totally dependent upon jvm(run time)
         wich come into existence during run time
         when we create array object it will take memory from heaps so that 
         its totally depends upon jvm whether the memory is contiguous or not
         1)array objects are in heap
         2)heap objects are not continous
         3)Dynamic memory allocation
         4)hence array objects are in heap so u can say that array is not contnuous in java
         It totally depends upn the JVM
         hap memory and all memory are in JVM only

    */
        //  For integer the values assigned is zero
        String[] name=new String[3];
        System.out.println(name[1]);
        // By default String is initialized will "null"
        // String[] arr=new String[5];non primitive data type
        //  integral working of object
        //stack mem             heap mem
        // arr---->  {null,null,null,null,null};
        //             arr[0]-->refrence to null object
        
    }
}
