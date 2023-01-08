import java.lang.*;
import java.util.Scanner;


// Lets talk about Prism and Pyramids
// Pyramid-->base-->rectangle
// height-->
// voume-->1/3*area of base*h
// Prism -->cuboid and rectangular prism both are same
// cube and square prism is same
// volume=area of base*h
public class PrismAndPyramid {
    static double volume(double l,double w,double h){
        return 1/3*(l*w*h);
    }
   public static void main(String[] args) {
      System.out.println("Enter length,width and height of Pyramid:");
      System.out.println("Volume of Pyramid:"+volume(12, 13, 17));
   }    
}
