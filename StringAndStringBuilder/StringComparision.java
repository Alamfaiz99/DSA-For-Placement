import java.lang.*;

//How to create diffrent objects of the same value
// We have to tell explicitly to create a new object
// With the help of 'new' keyword u can create new object with the same value

public class StringComparision {
   public static void main(String[] args) {
    // If u wanna compare two string how would you compare two strings 
    String a="kunal";
    String b="kunal";
    // Hence this is string pool-->means value is same
    //==This is the prove-->memory location ko compare krta h
    System.out.println(a==b);
    // Here memory location is same means they all refer at the same memory location
   //  reference variable is  referring at the same object
    String a1=new String("Apple");
    String b1=new String("Apple");
    System.out.println(a1==b1);
    //Now it'll return false 
   //  it will create the object outside the pool but in the heap

   // When you only need to check the value then use equals method
   System.out.println(a1.equals(b1));
   }   
}
