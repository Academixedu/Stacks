import java.util.Iterator;
import java.util.Stack;
public class Create{
public static void main(String[]args){
// Create an Object for Stack
  // Load Values in Stack
  // Iterate it by usig Iterator and While Loops
  Stack<Integer> List = new Stack<>();
  List.push(1);
  List.push(2);
  List.push(77);
  Iterator<Integer> i=List.iterator();
  while(i.hasNext()){
      System.out.println(i.next());
  }
  

}
}

