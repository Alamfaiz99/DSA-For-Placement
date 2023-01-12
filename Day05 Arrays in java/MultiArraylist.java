import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MultiArraylist {
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     ArrayList<ArrayList<Integer>> list=new ArrayList<>();
    //  This would create multidimensional array list
    // initialization part
    for (int i = 0; i < 3; i++) {
        list.add(new ArrayList<>());
      }
    //   Lets add elements into it
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            list.get(i).add(sc.nextInt());;
        }
    }
    System.out.println(list);
   }    
}
