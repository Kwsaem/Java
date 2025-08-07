package Project1.Services.Implementations;

import Project1.Model.Juice;
import Project1.Model.Order;
import Project1.Services.Interfaces.Chefserv;
import Project1.Services.Interfaces.Deliveryserv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DeliveryServImpl implements Deliveryserv {
    @Override
    public void viewOrder() {
        String ordersFilePath = "/home/yzr/IdeaProjects/BackendJava/Java/Project1/Data/Orders.txt";

        List<Order> orders = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ordersFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Each line looks like: "Orange, 40 EGP"
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    if (parts[3].equals("Ready for delivery")) {
                        String id = parts[0].trim();
                        String quantity = parts[1].trim();
                        String juiceName = parts[2].trim();
                        String status = parts[3].trim();
                        System.out.println(id + " " + quantity + " " + juiceName + " " + status);
                    }

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    @Override
    public void updateOrderStatus(String orderId, String orderStatus) {
        String ordersFilePath = "/home/yzr/IdeaProjects/BackendJava/Java/Project1/Data/Orders.txt";
        List<String> lines = new ArrayList<>();
        boolean orderUpdated = false;

        try (BufferedReader br = new BufferedReader(new FileReader(ordersFilePath))) {
            String line;

            // Read all lines and update the specific order's status
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String id = parts[0].trim();
                    if (id.equals(orderId)) {
                        // Update the order's status
                        parts[3] = orderStatus.trim();  // Update the status field
                        orderUpdated = true;
                    }
                    // Reconstruct the line and add to the list
                    lines.add(String.join(",", parts));
                }
            }

            // If the order was updated, write the updated content back to the file
            if(orderStatus.equals("Ready for delivery")) {
                if (orderUpdated) {
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(ordersFilePath))) {
                        for (String updatedLine : lines) {
                            bw.write(updatedLine);
                            bw.newLine();
                        }
                        System.out.println("Order " + orderId + " status updated to " + orderStatus);
                    }
                }
            }
            else {
                System.out.println("Order " + orderId + " isn't ready for delivery yet.");
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}