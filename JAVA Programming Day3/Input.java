import java.lang.*;
import java.util.Scanner;

public class Input {
   public static void main(String[] args){
    // You can seperate , with _ in order to write the number 
    Scanner input=new Scanner(System.in);
    int a=230_000_000;
    System.out.println(a);
    System.out.println("Enter a number:");
    String name=input.nextLine();
    System.out.println(name);
   }    
}
