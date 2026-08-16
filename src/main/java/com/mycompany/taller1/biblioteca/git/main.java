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
}
