package com.homework.daniel.book;

import com.homework.daniel.book.Model.BestSeller;
import com.homework.daniel.book.Model.Book;
import com.homework.daniel.book.Model.Storage;


public class LibraryCase {

        static BestSeller bestSeller1 = new BestSeller(1,"some_book1",20.0,"...",200);
        static Book book1 = new Book(1,"some_book1",20.0);
        static Book book2 = new Book(2,"some_book2",12.0);
        static Book book3 = new Book(3,"some_book3",18.0);
    public static void main(String[] args) {

        Storage storage = new Storage();
        storage.addBook(book1,5);
        storage.addBook(book2,6);
        storage.addBook(book3,2);
        storage.rentBook(book1);
        storage.returnBook(book1);
        storage.printArray(storage.books);
        storage.getInStock(book1);
        bestSeller1.toString();
        System.out.println(bestSeller1.compareTo(book3));


        }

}

