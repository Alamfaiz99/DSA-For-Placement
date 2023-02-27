import java.lang.*;
// Check if the string is palindrome or not
import java.util.Arrays;

public class Palindrome {
    public static boolean palindrome(String str){
      str=str.toLowerCase();
      for(int i=0;i<str.length()/2;i++){
        char start=str.charAt(i);
        char end=str.charAt(str.length()-i-1);
        if(start!=end){
            return false;
        }
        int[] arr={1,2,3,4,5};
      }
      return true;
    }
    public static void main(String[] args) {
    String str="aabaa";
    System.out.println(palindrome(str));
  }    
}
