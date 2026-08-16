/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller1.biblioteca.git;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static ArrayList<Client> clients = new ArrayList<>(); 
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        createClient();
        listClients();
        findClient();
        updateClient();
    }
    //crear cliente
    public static void createClient(){
        System.out.print("enter the customer ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("enter the customer's name: ");
        String nombre = sc.nextLine();

        System.out.print("Enter the customer's phone number: ");
        String telefono = sc.nextLine();

        System.out.print("Enter the customer's email address: ");
        String email = sc.nextLine();

        Client client = new Client(id, nombre, telefono, email);

        clients.add(client);

        System.out.println("Client created successfully.");
    }
    //lista de clientes
    public static void listClients() {

        if (clients.isEmpty()) {
        System.out.println("There are no registered customers.");
        return;
        }

        System.out.println("\n*** customer list ***");

        for (Client client : clients) {
            System.out.println("ID: " + client.getId());
            System.out.println("Name: " + client.getName());
            System.out.println("Phone: " + client.getPhone());
            System.out.println("Email: " + client.getEmail());
            System.out.println("-------------------------");
        }
    }
    public static void findClient() {

        System.out.print("Enter the ID of the customer you wish to search for: ");
        int id = sc.nextInt();
        sc.nextLine();
        for (Client client : clients) {
            if (client.getId() == id) {
                System.out.println("\n*** customer found ***");
                System.out.println("ID: " + client.getId());
                System.out.println("Name: " + client.getName());
                System.out.println("phone: " + client.getPhone());
                System.out.println("Email: " + client.getEmail());

                return;
            }
        }

        System.out.println("No se encontro un cliente con ese ID.");
    }
    public static void updateClient() {

        System.out.print("Enter the ID of the customer you wish to update: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Client client : clients) {

            if (client.getId() == id) {

                System.out.print("Enter the new name: ");
                String nombre = sc.nextLine();

                System.out.print("Enter the new phone: ");
                String telefono = sc.nextLine();

                System.out.print("Enter the new email: ");
                String email = sc.nextLine();

                client.setName(nombre);
                client.setPhone(telefono);
                client.setEmail(email);

                System.out.println("Client updated successfully.");

                return;
            }
        }

        System.out.println("No client was found with that ID.");
    }
}

