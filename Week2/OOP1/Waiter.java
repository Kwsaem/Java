package Week2.OOP1;

public class Waiter extends Employee {
    public Waiter(String name, int age, double salary, String role) {
        super(name, age, salary, role);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Waiter "+ getName()+ " is serving customers." );
    }
}
