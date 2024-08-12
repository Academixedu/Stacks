 package collection;
import java.util.Iterator;
import java.util.Stack;

public class Create {
    public static void main(String[] args) {
        Stack<String> s=new Stack<>();
        s.push("Bharath");
        s.push("Ammu");
        s.push("Queen");
        Iterator<String> iterator = s.iterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
      }
    }
        
