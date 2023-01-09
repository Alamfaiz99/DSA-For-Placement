import java.lang.*;
import java.util.Scanner;

public class FactorialA1 {
  static  int factorial(int n){
    int fact=1;
    while(n>1){
       fact*=n;
       n--;
    }
    return fact;
  } 
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    int res=factorial(n);
    System.out.println("Factorial of "+n+" is "+res);
  }    
}
