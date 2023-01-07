import java.lang.*;
import java.util.Scanner;

public class PrimeFun {
    static boolean prime(int n){
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
            else{
                continue;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        boolean ans=prime(n);
        System.out.println(ans);
    }
    // create a function to check whether it is prime or not
}
