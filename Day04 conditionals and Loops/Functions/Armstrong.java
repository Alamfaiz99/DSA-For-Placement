import java.lang.*;
import java.util.Scanner;

public class Armstrong {
    static int count(int n){
      int c=0;
      while(n!=0){
        c=c+1;
        n=n/10;
      }
      return c;
    }
    static boolean armstrong(int n){
        int l=count(n);
        // System.out.println(l);
        int r;
        double s=0;
        while(n!=0){
            r=n%10;
            s=s+Math.pow(r,l);
            n=n/10;

        }
        System.out.println(s);
        if(n==(int)s){
            return true;
        }
        else{
          return false;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean ans=armstrong(n);
        System.out.println(ans);
    }
}
