package Project1.Data;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Project1.Model.*;

public class Dataloader {

    private String menuFilePath = "/home/yzr/IdeaProjects/BackendJava/Java/Project1/Data/Menu.txt";
    private String usersFilePath ="/home/yzr/IdeaProjects/BackendJava/Java/Project1/Data/Users.txt";

    public List<Juice> loadMenu() {
        List<Juice> juices = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(menuFilePath))) {
            String line;
            int id = 1; // Starting ID for juices
            while ((line = br.readLine()) != null) {
                // Each line looks like: "Orange, 40 EGP"
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String juiceName = parts[0].trim();
                    String pricePart = parts[1].trim(); // "40 EGP"
                    // Extract only the number part
                    String priceString = pricePart.split(" ")[0];
                    int price = Integer.parseInt(priceString);

                    Juice juice = new Juice();
                    juice.setId(id++);
                    juice.setName(juiceName);
                    juice.setPrice(price);

                    juices.add(juice);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return juices;
    }

    public List<User> loadUser(){
        List<User> users = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(usersFilePath))) {
            String line;
            int id = 1; // Starting ID for juices
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String username = parts[0].trim();
                    String password = parts[1].trim();
                    String role = parts[2].trim();

                    if (role.equals("Chef")) {
                        User user = new Chef(username, password,role);
                        users.add(user);
                    }
                    if (role.equals("Delivery")) {

                        User user = new Delivery(username, password, role);
                        users.add(user);
                    }
                    if (role.equals("Customer")) {
                        User user = new Customer(username, password,role);
                        users.add(user);
                    }


                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

}


