import java.lang.*;
import java.util.Scanner;

public class TakeIn0 {
    // static int sum(){
    //     int i,s=0;
    //     Scanner sc=new Scanner(System.in);
    //     while((i=sc.nextInt())!=0){
    //        s=s+i;
    //     }
    //     return s;
    // }
    static int largest(){
        int n=0,i;
        Scanner sc=new Scanner(System.in);
        while((i=sc.nextInt())!=0){
           if(i>n){
            n=i;
           }
        }
        return n;
    }
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int ans=largest();
     System.out.println(ans);
   }    
}
