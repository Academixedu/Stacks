import java.util.Stack;
import java.util.Iterator;

public class Create {
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

       
        Iterator<Integer> ite = stack.iterator();
        while (ite.hasNext()) {
            Integer value = ite.next();
            System.out.println(value);
        }
    }
}
