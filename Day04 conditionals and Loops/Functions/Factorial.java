import java.lang.*;
import java.util.Scanner;

public class Factorial {
    static int function(int n){
       if(n==0 || n==1)
         return 1;
       return n*function(n-1);
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int ans=function(n);
        System.out.println("Factorial of "+n+":"+ans);
    }
}
