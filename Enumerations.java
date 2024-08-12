import java.util.Enumeration;
import java.util.Stack;

public class Enumerations{
  String name;
  int age;
  
  public Enumerations(String name, int age)
  {
    this.name = name;
    this.age = age;
  }
  public static void main(String[]args){
   // Create an Object for Stack
  // Load person class Objects in it
  // Iterate it by using Enumeration
  // print the values by using while Loop


  Stack<Enumerations> p = new Stack<>();
  p.push(new Enumerations("Rama", 25));
  p.push(new Enumerations("seetha", 25));

  Enumeration<Enumerations> e = p.elements();
  while (e.hasMoreElements()) {
      Enumerations person = e.nextElement();
      System.out.println("Name: " + person.name + ", Age: " + person.age);
  }
}
}


