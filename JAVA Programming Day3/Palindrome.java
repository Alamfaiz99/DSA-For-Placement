import java.lang.*;
import java.util.Scanner;

// menas a string when we read from l to right and r-l appears to be exact same then
// that string is known as palindrome

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.next();
        String ns="";
        for(int i=s.length()-1;i>=0;i--){
            ns=ns+s.charAt(i);
        }
        if(s.equals(ns)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
