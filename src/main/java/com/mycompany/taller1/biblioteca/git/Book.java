package com.mycompany.taller1.biblioteca.git;

public class Book extends Material{
    private String author;
    private boolean available;
    public Book(String code,String title,String yearpublication, String autor){
        super(code,title,yearpublication);
        this.author=author;
        this.available=true;
    }
     public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isavailable() {
        return available;
    }

    public void setavailable(boolean available) {
        this.available = available;
    }
}
