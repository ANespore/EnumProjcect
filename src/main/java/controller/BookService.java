package controller;
import Types.Genre;
import entity.Author;
import entity.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookService {




        private ArrayList<Book> bookList = new ArrayList<>();

        //Adding Books to the list
        public void addBook(Book book) {
                this.bookList.add(book);
        }


        // Removing books from the list
        public void removeBook (Book book) {
                this.bookList.remove(book);
        }

        //returning  a list of all books
        public  ArrayList<Book> listBooks (){
                return bookList;
        }


        //returning a list of books by Fantasy type
        public  ArrayList<Book> listByTypeFantasy (){
            ArrayList<Book> booksByFantasy = new ArrayList<>();
                for (Book book: bookList) {
                        if(book.getGenretype().equals(Genre.FANTASY)) {
                                booksByFantasy.add(book);

                        }
                }
                return  booksByFantasy;
        }
        //returning a list of books  released before 1999

    public ArrayList<Book> listOfBooksBefore1999(){
            ArrayList<Book> booksBefore199 =new ArrayList<>();
            for (Book book: bookList) {
                if(book.getYearOfRelease() <1999) {
                    booksBefore199.add(book);
                }
            }
            return booksBefore199;
    }
    //returning the most expensive boook
    public Book mostExpensiveBook() {
            Book mostExpensive = bookList.get(0);
            for(Book book: bookList) {
                if (book.getPrice()>mostExpensive.getPrice()) {
                    mostExpensive = book;
                }
            }

            return mostExpensive;
    }


        //returning cheapest book

    public Book mostCheapestBook() {
        Book mostCheapest = bookList.get(0);
        for(Book book: bookList) {
            if (book.getPrice()<mostCheapest.getPrice()) {
                mostCheapest = book;
            }
        }

        return mostCheapest;
    }

    //returning a book written by 3 authors
    public Book bookBy3authors() {
        for (Book book : bookList) {
            if (book.getAuthors().size() == 3) {
                return book;
            }
         }
            return null;
    }

        //verifying a book is on the list
        public Boolean  verifyBook (Book book)
        {
            //booklist.contains() is a method in the Arraylist that returns true if the item is present in the array list.
            return bookList.contains(book);
        }

        // returns an Array list of Books
        public ArrayList<Book> listofBooksByAuthor(Author author){
        ArrayList<Book> authorBooks = new ArrayList<>();

            for (Book book: bookList) {
                for (Author author1: book.getAuthors()) {
                        if (author.equals(author1)) {
                            authorBooks.add(book);
                        }
                }
            }
            return  authorBooks;
        }




}

