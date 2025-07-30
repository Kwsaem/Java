package Week2.OOP2;

public class Chef extends Employee implements Eatable {

    public Chef(String name, int age, double salary, String role) {
        super(name, age, salary, role);
    }

    @Override
    public void work() {

        System.out.println("Chef "+ getName()+ " is cooking." );
    }

    @Override
    public void eat() {
        System.out.println("Chef "+ getName()+ " is tasting the food." );
    }
}
