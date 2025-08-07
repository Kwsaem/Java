package Project1;

import Project1.Data.Dataloader;
import Project1.Model.Customer;
import Project1.Model.Juice;
import Project1.Model.User;
import Project1.Services.Implementations.ChefServImpl;
import Project1.Services.Implementations.CustomerServImpl;
import Project1.Services.Implementations.DeliveryServImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dataloader d = new Dataloader(); // BTCALL ELCLASS
        List<User> users = d.loadUser(); //BTGEEB ELLIST ELLY GOWA HNAK DE
        System.out.println("Welcome to Juice Planet,where the best juices are made!!!!!!!!!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your username:");
        String username = sc.nextLine();
        User mainUser;
        String role = "not yet";
        for(User user : users) { //BT3ADI 3LA ITEM ITEM L8AYET LMA TLA2I ELLY KATBO MWGOOD OR NO
            if(user.getUsername().equals(username)) {
                System.out.println("Please enter your password:");
                String password = sc.nextLine();
                if (user.checkPassword(password)) {
                    mainUser = user;
                    role = user.getRole();
                }
            }
        }
        if (role.equals("not yet")) {
            System.out.println("Your username is not in our list, would you like to register as a new customer with username, " + username + "?");
            String reg= sc.nextLine();
            if  (reg.equals("yes")) {
                System.out.println("Please enter your password:");
                String pass1 = sc.nextLine();
                System.out.println("Please re-enter your password:");
                String pass2 = sc.nextLine();
                if (pass1.equals(pass2)) {
                    User user= new Customer(username, pass1, "Customer");
                    users.add(user);
                    ((Customer) user).register(username, pass1);
                    role = "Customer";
                }
                else {
                    System.out.println("Passwords do not match");
                }
            }
        }

        if (role.equals("Chef")){
            System.out.println("Wussup,Chef");
            ChefServImpl chefServImpl = new ChefServImpl();
            System.out.println("1# Want to view the orders");
            System.out.println("2# Want to update the orders' status");
            int chefWants=sc.nextInt();
            if (chefWants==1) {
                chefServImpl.viewOrder();
            }
            else if (chefWants == 2) {
                System.out.println("Enter order ID:");
                sc.nextLine(); // This ensures the previous input is consumed if necessary
                String orderId = sc.nextLine();
                System.out.println(orderId);
                chefServImpl.updateOrderStatus(orderId, "Ready for delivery");

            }
        }
        if (role.equals("Customer")){
            System.out.println("Wussup,Customer");
            CustomerServImpl customerServImpl = new CustomerServImpl();
            customerServImpl.viewMenu();
            customerServImpl.makeOrder();
        }
        if (role.equals("Delivery")){
            System.out.println("Wussup,Delivery");
            DeliveryServImpl deliveryServImpl = new DeliveryServImpl();
            System.out.println("1# Want to view the orders");
            System.out.println("2# Want to update the orders' status");
            int Deliverywants=sc.nextInt();
            if (Deliverywants==1) {
                deliveryServImpl.viewOrder();
            }
            else if (Deliverywants == 2) {
                System.out.println("Enter order ID:");
                sc.nextLine(); // This ensures the previous input is consumed if necessary
                String orderId = sc.nextLine();
                System.out.println(orderId);
                deliveryServImpl.updateOrderStatus(orderId, "Delivered");
            }
        }

    }
}
