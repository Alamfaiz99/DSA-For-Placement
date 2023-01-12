import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList01 {
  public static void main(String[] args) {
    // Now we will talk about ArrayList
    // arrayList is dynamic approach to allocate memory when we 
    // dont know how much elements we have to store..
    // Here memory is allocated during runtime..
    Scanner sc=new Scanner(System.in);
     ArrayList<Integer> list=new ArrayList<>(10);
    //  <> you can give the datatype of integer
    // initial value you can pass as input
    // add data in arraylist
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(29);
    list.add(50);
    list.add(80);
    // update the value
    list.set(1, 76);
    System.out.println(list);   
  for(int i=0;i<5;i++){
     list.add(sc.nextInt());
  }
  for(int i=0;i<5;i++){
    System.out.println(list.get(i));
 }}
}
// size is filled internally
// say array list fills by some extent
// it will create new array list of doublesize 
// old elements are copied in new array

    