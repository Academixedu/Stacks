import java.util.Stack;
import java.util.Enumeration;

public class Enumerations{
  public static void main(String[]args){
    Stack<Object> sc=new Stack<Object>();
    sc.push("Manoj");
    sc.push(100);
    sc.push(99.99);
    sc.push(true);

    Enumeration a=sc.elements();

    while(a.hasMoreElements()){
      System.out.println(a.nextElement());
    }
     System.out.println("stack performed by both using objects and person class");

    Stack<Person2> p2=new Stack<Person2>();
    p2.push(new Person2("Manoj",0,11));
    p2.push(new Person2("Mj",90,88));
    p2.push(new Person2("og",20,1));

    Enumeration e=p2.elements();
    while(e.hasMoreElements()){
      System.out.println(e.nextElement());
    }


   

  }}
