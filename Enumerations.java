import java.util.Stack;
import java.util.Enumeration;

public class Enumerations{
   // Create an Object for Stack
  // Load person class Objects in it
  // Iterate it by using Enumeration
  // print the values by using while Loop


    public static void main(String[] args) {
    
        Stack<Person> s = new Stack<>();
    
        s.push(new Person("fayaz", 21));
        s.push(new Person("sai", 21));
        s.push(new Person("karthik", 21));

        Enumeration<Person> enumeration = s.elements();

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
  }
    class Person {
      String name;
      int age;
  
      Person(String name, int age) {
          this.name = name;
          this.age = age;
      }
  
      public String toString() {
          return name + "  " + age;
      }
  }
