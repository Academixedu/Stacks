public class Persons {

    private String name;
    private int age;
    private String jobrole;
    private int salary;
    public Persons(String name, int age, String jobrole, int salary) {
        this.name = name;
        this.age = age;
        this.jobrole = jobrole;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getJobrole() {
        return jobrole;
    }
    public void setJobrole(String jobrole) {
        this.jobrole = jobrole;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Persons [name=" + name + ", age=" + age + ", jobrole=" + jobrole + ", salary=" + salary + "]";
    }
    

    
}
