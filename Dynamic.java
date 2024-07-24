import java.util.Stack;

import java.util.Iterator;

public class Dynamic{
public static void main(String[]args){
// Create an Object for Stack
Stack<Persons> st = new Stack<Persons>();
  // Load person class Objects in it using push function;
  st.push(new Persons("nani", 25, "developer", 25000));
  st.push(new Persons("sai", 20, "manager", 35000));
  st.push(new Persons("sri", 30, "web developer", 45000));
  st.push(new Persons("sri", 40, "tester",50000));
  // Iterate it by using List Iterator
  Iterator<Persons> i = st.listIterator();
  // print the values by using while Loop
  while(i.hasNext()){
    System.out.println(i.next());
  }
}
}
