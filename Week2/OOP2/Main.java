package Week2.OOP2;

public class Main {
    public static void main(String[] args) {
    Chef chef= new Chef("hamada", 17,5000,"Chef" );
    Waiter waiter= new Waiter("abo hmed",20,3000,"Waiter");
    chef.introduce();
    waiter.introduce();
    chef.work();
    waiter.work();
    chef.eat();
    waiter.eat();
    }
}
