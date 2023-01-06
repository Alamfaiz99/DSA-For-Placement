import java.lang.*;
import java.util.Scanner;

// THis is iterative method
// O(n)
public class FibonacciSeries {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);  
      int f=0,s=1,n,next;
      System.out.print("Enter the no of terms:");
      n=sc.nextInt();
      int i=1;
      while(i<=n){
        System.out.println(f+",");
        next=f+s;
        f=s;
        s=next;
        i++;
      };
    }
}
