import java.util.Scanner;

// Here we will talk about the scope of variables
public class Scope {
    static void random(int marks){
        int num=67;
        System.out.println(num);
        System.out.println(marks);
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        {
            a=78;//global scope for a
            int c=99;//local scope inside this function
            // initialized inside the block will be in the block
        }
        // System.out.println(c);
        // cannot be used outside the block
    }
}
