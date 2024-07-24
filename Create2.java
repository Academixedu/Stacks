import java.util.Stack;
import java.util.Iterator;
public class Create2{
public static void main(String[]args){

Stack<Integer> sc=new Stack<Integer>();

sc.push(777);
sc.push(888);
sc.push(999);

System.out.println(sc);

System.out.println("using iterator and while loop");

Iterator<Integer> it=sc.iterator();

while(it.hasNext()){

System.out.println(it.next());

}



}
}
