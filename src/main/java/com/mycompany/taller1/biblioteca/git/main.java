/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller1.biblioteca.git;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static ArrayList<Client> clients = new ArrayList<>();
    static ArrayList<Book> books = new ArrayList<>();
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
    public static void deleteClient() {

        System.out.print("Enter the ID of the client you want to delete: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < clients.size(); i++) {

            if (clients.get(i).getId() == id) {

                clients.remove(i);

                System.out.println("Client deleted successfully.");

                return;
            }
        }

        System.out.println("No client was found with that ID.");
    }
    //crear libro
    public static void createBook() {

        System.out.println("\n*** create book ***");

        System.out.print("code: ");
        String code = sc.nextLine();

        System.out.print("title: ");
        String title = sc.nextLine();

        System.out.print("year of publication: ");
        String yearpublication = sc.nextLine();

        System.out.print("Author: ");
        String author = sc.nextLine();

        Book book = new Book(code, title, yearpublication, author);

        books.add(book);

        System.out.println("book created correctly");
    }
    public static void listbooks() {

        System.out.println("\n*** list of books ***");

        if (books.isEmpty()) {
            System.out.println("There are no registered books.");
            return;
        }

        for (Book book : books) {
            System.out.println(book);
        }
    }
    public static Book buscarBook(String code) {

        for (Book book : books) {

            if (book.getCode().equals(code)) {
                return book;
            }    
        }
        return null;
    }
    public static void updateBook() {

        System.out.println("\n*** update book ***");

        System.out.print("Enter the book code: ");
        String code = sc.nextLine();

        Book book = buscarBook(code);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        System.out.print("New title: ");
        String newTitle = sc.nextLine();

        System.out.print("New publication year: ");
        String newYear = sc.nextLine();

        System.out.print("New author: ");
        String newAuthor = sc.nextLine();

        book.setTitle(newTitle);
        book.setYearpublication(newYear);
        book.setAuthor(newAuthor);

        System.out.println("Book updated successfully.");
    }
    public static void deleteBook() {

        System.out.println("\n*** delete book ***");

        System.out.print("Enter the book code: ");
        String code = sc.nextLine();

        Book book = buscarBook(code);

        if (book == null) {
            System.out.println("book not found");
            return;
        }

        books.remove(book);

        System.out.println("Book successfully deleted.");
    }
}

