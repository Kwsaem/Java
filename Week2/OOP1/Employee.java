package Week2.OOP1;

public class Employee  extends Person{
    private double salary;
    private String role;
    public Employee(String name, int age,double salary,String role) {
        super(name, age);
        this.salary = salary;
        this.role = role;
    }

    public void work() {
        System.out.println("I am working as a "+ role+" and i earn "+salary+" per month.");
//
   }
}
