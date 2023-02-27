import java.lang.*;

// Now lets talk about the string performance
// That is very important from interview round

public class PerformanceIMP {
   public static void main(String[] args) {
     String series="";
     for(int i=0;i<26;i++){
        char ch=(char)('a'+ i);
        series+=ch;
     }    
     System.out.println(series);
    //  If any of the data is string it will be converted into string
    // series=""+a-->"a"
    // +a+b-->"ab"
    // +ab+c-->"abc"
    // Every time new object is creaed and deallocate
    // hence it is not a good practice
    // 1+2+3+3-->O(n^2)
    // Is there any datatype that creates new string and add them to the same string
    // Yes that is known as string builder
    // series="abc"+d-->abcd
    
   }    
}
