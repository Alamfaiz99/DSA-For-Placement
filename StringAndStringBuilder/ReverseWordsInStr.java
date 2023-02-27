import java.lang.*;
import java.util.Arrays;
// We have to reverse words in a string
// Lets see how to do it
public class ReverseWordsInStr {
        System.out.println(s.length());
    public static void reverseWords(String s) {
        //First use strip() method to remove leading and trailing spaces
        String news=s.strip();
        // Now we are splitting array with the help of spaces
        String[] str=news.split(" ");
        System.out.println(Arrays.toString(str));
      }
    public static void main(String[] args) {
        reverseWords("     faizan  alam is a good   boy");
    }
}
