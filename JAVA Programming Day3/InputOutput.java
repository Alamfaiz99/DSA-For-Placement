import java.lang.*;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args){
        // Scanner class is used to take the input
        // in-->standard input -->which is keyboard input
        // by default in=null;
        // in=FileStream or any other file
        // out refres to display screen
        // out=null
        System.out.println("Enter a number:");
        Scanner input=new Scanner(System.in);
        char ch=input.next().charAt(0);
        System.out.println("The entered character is "+ch);

    }
}
