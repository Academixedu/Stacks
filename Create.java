import java.util.*;
public class Create{
  public static void main(String[]args){
  // create  a Linked List class object
    // Add Values in it
    // Iterate it by using Iterator
    Stack<Integer> a=new Stack<Integer>();
    a.add(1);
    a.add(2);
    a.add(3);
    Iterator i=a.listIterator();
    while(i.hasNext()){
      System.out.println(i.next());
    }

  }
  }