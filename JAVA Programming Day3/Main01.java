// Public means this class is accessible by everyone
// Everything can access this class whether it is package and other class.
// This class can be accessible from any where whether it is other package or class.
public class Main01{
//    Function is a block of code

// String[]-->array in java
//array of strings
// args[0],args[1],args[2]
// java Main01 30-->pass arguments like this
// java Main01 30 "fazian"
      public static void main(String[] args){
        // static variable and functions donot depends upon object
        // it will execute itself
        // this main function is the entry point of the java program
        // thats why we create it staic so that it will executes from here
        // withour looking for objects
        System.out.println("Hello World!");
        System.out.println(args[1]);
      }
}

// -->Byte code must be in Byte code directory
// -->source code must be in src code directory

// package simply means a folder
// import java.lang.*;
// java-->package lang->package -->nder various classes