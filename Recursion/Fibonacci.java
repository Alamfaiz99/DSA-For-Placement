/*
 * Lets see how to solve the recursive function
 * fibonacci number
 * 0 1 1 2 3 5 8 13
 * fibo(1)-->0
 * fibo(2)-->1
 * fibo(3)=fibo(2)+fibo(1);
 * fibo(n)=fibo(n-1)+fibo(n-2);
 * That is known as recurrance relation
 * Base conditions are represented by answers we already have
 * 
 */

public class Fibonacci{
   //Lets create a recursive function for fibonacci series
   public static void fibonacci(int n1,int n2,int n){
        // base condition
        if(n<2){
            System.out.println(n1);
            return;
        }
        int n3=n1+n2;
        // If written find nth fibonacci numbr then just make the recursion till n
        // System.out.print(n1+" ");
        fibonacci(n2, n3, n-1);
    }

    // Find nth fibonacci number
    public static int fibo(int n){
        // Base consdition
        if(n==1) return 0;
        if(n==2) return 1;
        // REcurrance relation
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
       System.out.println(fibo(5));   
   }
}