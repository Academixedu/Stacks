import java.util.Stack;
import java.util.ListIterator;



public class Dynamic {
    public static void main(String[] args) {
       
        Stack<Person> stack = new Stack<>();

        stack.push(new Person("Medhas", 22));
        stack.push(new Person("Charan", 22));
       
       
        ListIterator<Person> listIterator = stack.listIterator();
        while (listIterator.hasNext()) {
            Person person = listIterator.next();
            System.out.println(person);
        }
    }
}

