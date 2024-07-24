import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class ForL{
public static void main(String[]args){
// create  a Linked List class object
  // Add Values in it
  // Iterate it by using Iterator
  Stack<Integer> a=new Stack<Integer>();
  a.add(1);
  a.add(2);
  a.add(3);
  a.peek();
 a.pop();
 
 Enumeration e=a.elements();
 while(e.hasMoreElements()){
  System.out.println(e.nextElement());
 }

  }
}