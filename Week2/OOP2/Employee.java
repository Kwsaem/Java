package Week2.OOP2;

public  abstract class Employee  extends Person {
    private double salary;
    private String role;
    public Employee(String name, int age,double salary,String role) {
        super(name, age);
        this.salary = salary;
        this.role = role;
    }

    public abstract void work();
}
