package Week2.OOP2;

public class Waiter extends Employee implements Eatable{
    public Waiter(String name, int age, double salary, String role) {
        super(name, age, salary, role);
    }

    @Override
    public void work() {
        System.out.println("Waiter "+ getName()+ " is serving customers." );
    }
    public void eat() {
        System.out.println("Waiter "+ getName()+ " is having a quick meal break." );
    }
}
