package Project1.Services.Implementations;

import Project1.Data.Dataloader;
import Project1.Model.Juice;
import Project1.Services.Interfaces.Customerserv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class CustomerServImpl implements Customerserv {
    public void viewMenu(){
        Dataloader dal = new Dataloader();//BTGEEB ELLIST MN HNAK
        List<Juice> juices= dal.loadMenu();

        for (Juice juice:juices){
            System.out.println(juice.getId()+" "+ juice.getName()+" "+ juice.getPrice()+" EGP") ;
        }
    }
    public void makeOrder(){
        Dataloader data = new Dataloader();
        List<Juice> juices= data.loadMenu();
        Scanner sc = new Scanner(System.in);


        String order = sc.nextLine().trim();

        System.out.println("How many?");
        int quantity=sc.nextInt();


        for (Juice juice:juices){
            Integer id=juice.getId();//id from data loader
            String name=juice.getName();// name from data loader
            if (order.equals(id.toString())|| order.equals(name)){//
                System.out.println(quantity+" "+name);
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/yzr/IdeaProjects/BackendJava/Java/Project1/Data/Orders.txt", true))) {


                    long lineCount = Files.lines(Paths.get("/home/yzr/IdeaProjects/BackendJava/Java/Project1/Data/Orders.txt")).count();



                    bw.write(lineCount+1 +", "+quantity+", "+name+", PENDING");
                    bw.newLine();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }



        }

    }
}
