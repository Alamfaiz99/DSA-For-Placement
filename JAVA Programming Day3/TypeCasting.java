import java.lang.*;
import java.util.Scanner;

public class TypeCasting {
   public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    // float num=input.nextFloat();//Type conversion will be done automatically
    // System.out.println("Enter number is "+num);   
    // for implicit type conversion you can convert a larger into smaller
    // type should be compatible
    // type casting
    int num=(int)(64.74f);
    System.out.println(num); 
    // automatic type promotion in java
    int a=257;
    byte b=(byte)a;
    System.out.println(b);
    // it will give the remaider of that number
    byte a1=43;
    byte b1=50;
    byte c1=100;
    int a2=(a1*b1)/c1;
    System.out.println(a2);
    // lets see this thing
    byte b2=42;
    char c2='a';
    short s2=1024;
    int i2=50000;
    float f2=5.67f;
    double d2=0.1234;
    double res2=(f2*b2)+(i2/c2)-(d2*s2);
    // float int d2
    System.out.println((f2*b2)+" "+(i2/c2)+" "+(d2*s2));
    System.out.println(res2);
  }    
}
