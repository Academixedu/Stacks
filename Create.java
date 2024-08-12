import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class prac1 {
        public static void main(String[]args){
        // Create an Object for Stack
          // Load Values in Stack
          // Iterate it by usig Iterator and While Loops
          Stack s=new Stack<>();
          s.push(33);
          s.push(587);
          s.push(5566);
          Enumeration f=s.elements();
          Iterator d=s.iterator();
          while (f.hasMoreElements()) {
            System.out.println(f.nextElement());
            
          }

        }
        }

