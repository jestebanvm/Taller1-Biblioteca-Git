
package com.mycompany.taller1.biblioteca.git;

public class loan {
    private Client client;
    private Book book;
    private boolean active;
    public loan(Client client, Book book) {
        this.client = client;
        this.book = book;
        this.active = true;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    } 
}
