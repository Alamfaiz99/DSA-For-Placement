import java.lang.*;
import java.util.ArrayList;

public class Operators {
   public static void main(String[] args) {
     System.out.println('a'+'b');//it will add the unicode value of the character
     System.out.println("a"+"b");//That uis known as string concatenation
     System.out.println('a'+3);//unicode value + 3 100
     System.out.println((char)('a'+3));//convert 100 into character
     System.out.println("a"+1);//it will give a1
    //  When an integer is concatenated with String then its wrapper class
    // integer will call Integer and it will class .toString()-->that will convert to string
    System.out.println("faizan"+new ArrayList<>());//faizan[]
    // Itb will also call the wrapper class
    // Integer and convert with the help of toString
    System.out.println("faizan"+new Integer(10));
    System.out.println(new Integer(56)+new ArrayList<>());
    //it will return an error +-->is compatible for string
    // and primitive datatypes only
    //Java has provided more functions on plus
    // Hence + is overloaded
    // That is knoen as function overloading
    // In java operator overloading is not supported that results in poor coding
    
   }    
}
