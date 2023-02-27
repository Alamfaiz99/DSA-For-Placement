import java.lang.*;
import java.util.Scanner;

public class PatternInfo {
    public static void pattern1(int n){
        // Run iinner for loop for no of rows
        for(int i=1;i<=n;i++){
            // Run inner for loop
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        //  For no of rows
        for(int i=1;i<=n;i++){
            // For no of cols for each rows
            for(int j=0;j<=n;j++){
                System.out.print("* ");
            }
            // After each row we require next line
            System.out.println();
        }
    }
    public static void pattern3(int n){
        //  For no of rows
        for(int i=1;i<=n;i++){
            // For no of cols for each rows
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            // After each row we require next line
            System.out.println();
        }
    }
    public static void pattern4(int n){
        //  For no of rows
        for(int i=1;i<=n;i++){
            // For no of cols for each rows
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            // After each row we require next line
            System.out.println();
        }
    }
    public static void pattern5(int n){
        //  For no of rows
        
        for(int i=1;i<=2*n-1;i++){
            // For no of cols for each rows
            int totalRows=i>n?2*n-i:i;
            for(int j=1;j<=totalRows;j++){
                System.out.print("* ");
            }
            System.out.println();
            // After each row we require next line
        }
    }
   public static void main(String[] args) {
    // Lets see how to create patterns
    //That will apply to every questions related to pattern
    // Why we do patterns?
    // In order to improve our thought process we require patterns
    // It will give you an iidea how to thing and how to iincrease
    // Problem solving capacity
    /*
     * How to approach pattern problem
     * Step1:Run outer for loop-->No of rows-->
     * step2:Run inner for loop -->for no of col
     * Step2 exten:Identify how many cols are there for each row
     * Step:Identify type of element in cols
     * step3:Find the relation in inner for loop and outer for loop for pattern
     */
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    int n=sc.nextInt();
    pattern1(n);
    pattern2(n);
    pattern3(n);
    pattern4(n);
    pattern5(n);
   }    
}
