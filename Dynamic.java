import java.util.Iterator;
import java.util.Stack;

public class prac3 {
    
        public static void main(String[]args){
        // Create an Object for Stack
          // Load person class Objects in it using push function
          // Iterate it by using List Iterator
          // print the values by using while Loop
         Stack d=new Stack<>();
         d.push(23);
         d.push(35);
         d.push(3777);
         Iterator s=d.iterator();
         while (s.hasNext()) {
            System.out.println(s.next());
            
         }


        }
        }

