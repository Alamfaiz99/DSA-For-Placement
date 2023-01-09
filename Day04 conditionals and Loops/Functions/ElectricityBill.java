import java.lang.*;
import java.util.Scanner;
// Now we have to find the Elctricity bill
// P=VI==>watt=volts*Amp
// Kilowatt-hours=watt/1000*time also known as units
// cost=unity*cost per unit(electricity bill)                                                                                                                                                                                                                                                                                                                                                                                                                                                              
public class ElectricityBill {
    // LETS Create a function to reverse the string
    static String reverse(String s){
        String res="";
        for(int i=((s.length())-1);i>=0;i--){
           res+=s.charAt(i);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s;
        s=sc.next();
        String res=reverse(s);
        System.out.println("The reversed string is "+res);
    }
}
