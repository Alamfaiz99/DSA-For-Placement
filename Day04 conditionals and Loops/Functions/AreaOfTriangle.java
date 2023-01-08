import java.lang.*;
import java.util.Scanner;

public class AreaOfTriangle {
    // Area of triangle if u have three sides of triangle
    // Tis function will calculate the area of triangle
    // // final double pi=3.14; in tjhis way you can declare pi in java
    // static double areaOfTriangle(double a,double b,double c){
    //     double s=(a+b+c)/2;
    //     double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
    //     return area;

    // }

    // Now lets find out the area of equilateral triangle
    static double areaOfTriangle(double a){
        double area=(Math.sqrt(3)/4)*Math.pow(a, 2);
        return area;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sides of triangle:");
        int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();
        double ans=areaOfTriangle(a);
        System.out.printf("Area of triangle is %.2f",ans);
    }
}
