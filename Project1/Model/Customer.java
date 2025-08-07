package Project1.Model;

import Project1.Data.Dataloader;
import Project1.Services.Interfaces.Customerserv;
import Project1.Services.Interfaces.Registrable;
import Week1.Assiut.L;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Customer extends User implements Registrable{
    List<Order> orders;

    public Customer(String username, String password, String role) {
        super(username, password,role);
    }
    public void viewmenu(List<Juice> juices) {

    }

    @Override
    public void register(String username, String password) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/yzr/IdeaProjects/BackendJava/Java/Project1/Data/Users.txt", true))) {
            // Check if role is valid before adding the user

            String userData = username + "," + password + "," + "Customer";

            // Append to the file
            bw.newLine(); // Ensure the new user is on a new line
            bw.write(userData);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}