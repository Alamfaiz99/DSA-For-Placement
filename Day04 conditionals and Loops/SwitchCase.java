import java.lang.*;
import java.util.Scanner;

public class SwitchCase{
   public static void main(String[] args) {
    // Now we will talk about switch case and it it also a shorthand for if else if statements
    /*
       switch(cases){
        case condition:body
                       break;
        case condition:body
                       break;
        case condition:body
                       break;
        case condition:body
                       break;
       }
       You can give as many as cases as you want
     */
    // Lets do a program
    Scanner in=new Scanner(System.in);
    String fruit=in.next();
    // if(fruit=="banana")-->it will check for the memory location 
    // if(fruit.equals("banana"))-->it will check the content only
    /*if(fruit.equals("mango")){
        System.out.println("King of fruit.");
    }
    if(fruit.equals("apple")){
        System.out.println("a sweet red fruit.");
    }
     */
//    Lets do with the help of switch case
   switch(fruit){
    case "Mango":
                System.out.println("King of fruits");
                 break;
    case "Banana":
                System.out.println("Yellow in color");
                break;
    case "apple":System.out.println("a sweet red fruit");
                break;
    default:System.out.println("Please provide a valid Input");
   }
//    next method for doing the same
    switch(fruit){
        case "Mango" ->System.out.print("King of fruits");
        case "Banana"->System.out.print("Sweet and Yellow in color");
        case "Apple"->System.out.print("red in color and Sweet");
        default->System.out.println("Plaese provide a valid input");
    }
// checking for week days and weeends
System.out.println("enter a number(1-7):");   
int day=in.nextInt();
switch(day){
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:System.out.println("Weekday");
            break;
    case 6:
    case 7:System.out.println("Weekend");
           break;
    default:System.out.println("Please enter a valid number:)"); 
}
// another way of doing this

switch(day){
    case 1,2,3,4,5->System.out.println("Weekday");
    case 6,7->System.out.println("weekend");
}
// Now lets see nested Switch case
int empID=in.nextInt();
switch(empID){
    case 1->System.out.println("SM Faizan Alam");
    case 2->System.out.println("Sharfe Alam");
    case 3->{System.out.println("Employee number 3..");
            String department=in.next(); 
            switch(department){
                case "IT"->System.out.println("IT Department");
                case "Management"->System.out.println("Management Department");
                default->System.out.println("No department found");
            }}
    default->System.out.println("Please provide valid input");
}

}}

