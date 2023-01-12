import java.lang.*;
import java.util.Scanner;

// How to Find the Largest and Smallest of Three Numbers in Java?

public class Ques01 {
    static int maximum(int n1,int n2,int n3){
       int max=n1;
       if(max<n2){
        max=n2;
       }
       if(max<n3){
        max=n3;
       }
       return max;
    }
    static int minimum(int n1,int n2,int n3){
        int min=n1;
        if(min>n2){
         min=n2;
        }
        if(min>n3){
         min=n3;
        }
        return min;
    }

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n1,n2,n3;
     System.out.println("Enter three numbers:");
     n1=sc.nextInt();
     n2=sc.nextInt();
     n3=sc.nextInt();
     int max=maximum(n1,n2,n3);
     int min=minimum(n1,n2,n3);
     System.out.println("Maximun:"+max);
     System.out.println("Minimum:"+min);
     sc.close();
    }
}
