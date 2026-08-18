package com.mycompany.taller1.biblioteca.git;

public class Client extends Person {

    private String email;

    public Client(int id, String nombre, String telefono, String email) {
        super(id, nombre, telefono);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}