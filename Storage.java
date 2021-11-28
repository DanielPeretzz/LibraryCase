package com.homework.daniel.book.Model;

import java.util.Arrays;

public class Storage {
    public final Book[] books;
    public final int[] stock;


    public Storage() {
        this.books = new Book[6];
        this.stock = new int[6];
    }

    public void addBook(Book book, int amount) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == null) {
                this.books[i] = book;
                this.stock[i] = amount;
                return;
            }
        }
    }
    public void rentBook(Book book){
        for (int i = 0; i < books.length; i++) {
            if (books[i] == book){
                stock[i]--;
            }
            else if(stock[i] < 0){
                stock[i] = 0;
            }
        }
    }
    public void returnBook(Book book){
        for (int i = 0; i < books.length; i++) {
            if (books[i] == book){
                stock[i]++;
            }

        }
    }
    public void getInStock(Book book){
        for (int i = 0; i < books.length; i++) {
            if (books[i] == book){
                System.out.println("we have : "+ books[i].getName() +" "+stock[i] + " in stock");
            }

        }
    }







    public void printArray(Book[] addBook) {
        System.out.println(Arrays.toString(addBook));
        System.out.println(Arrays.toString(stock));
    }
}
