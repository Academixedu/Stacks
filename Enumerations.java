 package collection;

import java.util.Enumeration;
import java.util.Stack;

public class Enumerations {
        public static void main(String[]args){
         // Create an Object for Stack
        // Load person class Objects in it
        // Iterate it by using Enumeration
        // print the values by using while Loop
         Stack<Person> s=new Stack<>();
      s.push(new Person("Bharath", 22));
      s.push(new Person("Ammu", 20));
      s.push(new Person("Queen", 100));
     Enumeration<Person> enumeration = s.elements();
        
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
      
        }
    }
}
