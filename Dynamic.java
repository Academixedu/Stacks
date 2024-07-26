import java.util.Iterator;
import java.util.Stack;

public class Dynamic{
public static void main(String[]args){
// Create an Object for Stack
  // Load person class Objects in it using push function
  // Iterate it by using List Iterator
  // print the values by using while Loop
   Stack<Person> st=new Stack<>();
   Person p=new Person("pratap",123,67000);
   st.push(p);
   st.push(new Person("Prasad",45,56000));
   st.push(new Person("ajay",67,89000));
   st.pop();
   Iterator<Person> i=st.listIterator();
   while (i.hasNext()) {
    System.out.println(i.next());
    
   }

    
  }
}

