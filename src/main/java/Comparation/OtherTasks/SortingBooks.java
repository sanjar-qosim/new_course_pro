package Comparation.OtherTasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingBooks {

    public static void main(String[] args) {
        Book book1 = new Book("The Hobbit", 1937);
        Book book2 = new Book("Harry Potter", 1997);
        Book book3 = new Book("The Wither", 1806);
        Book book4 = new Book("Robin Sharma", 2010);
        Book book5 = new Book("Do it", 1998);

        List <Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);

        System.out.println(bookList);
        Collections.sort(bookList);
        System.out.println(bookList);

    }
}

class Book implements Comparable <Book> {

    private String name;
    private int year;

    public Book(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Book anotherBook) {
        return Integer.compare(this.year, anotherBook.year);
    }
}