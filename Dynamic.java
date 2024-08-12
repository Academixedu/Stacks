 package collection;
import java.util.ListIterator;
import java.util.Stack;

public class Dynamic{
    public static void main(String[]args){
    // Create an Object for Stack
      // Load person class Objects in it using push function
      // Iterate it by using List Iterator
      // print the values by using while Loop
      Stack<Person> s=new Stack<>();
      s.push(new Person("Bharath", 22));
      s.push(new Person("Ammu", 20));
      s.push(new Person("Queen", 100));
        ListIterator<Person> iterator = s.listIterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
    }
    }
}
    
