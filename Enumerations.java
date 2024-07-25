import java.util.Stack;
import java.util.Enumeration;
import java.util.Iterator;

class Person {
    private String name;
    private int age;

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class Enumerations {
    public static void main(String[] args) {
       
        Stack<Person> stack = new Stack<>();

       
        stack.push(new Person("Medhas", 22));
        stack.push(new Person("Charan", 22));
       

       
        Enumeration<Person> enumeration = stack.elements();

       
        while (enumeration.hasMoreElements()) {
            Person person = enumeration.nextElement();
            System.out.println(person);
        }
    }
}
