import java.util.Stack;
import java.util.Iterator;
public class Dynamic2{

public static void main(String[]args){
  Stack<Person2> list = new Stack<Person2>();

  list.push(new Person2("Man",30,101));
  list.push(new Person2("women",28,102));
  list.push(new Person2("child",3,103));
  Iterator<Person2> it = list.iterator();
  while(it.hasNext()){
    System.out.println(it.next());
  }


}
}
