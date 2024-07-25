import java.util.Stack;
import java.util.ListIterator;



public class Dynamic {
    public static void main(String[] args) {
       
        Stack<Person> stack = new Stack<>();

       
        stack.push(new Person("John", 25));
        stack.push(new Person("Jane", 30));
        stack.push(new Person("Alice", 28));
        stack.push(new Person("Bob", 22));

       
        ListIterator<Person> listIterator = stack.listIterator();
        while (listIterator.hasNext()) {
            Person person = listIterator.next();
            System.out.println(person);
        }
    }
}

