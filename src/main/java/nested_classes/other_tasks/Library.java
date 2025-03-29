package nested_classes.other_tasks;

import java.util.LinkedList;
import java.util.List;

public class Library {

    List<Book> books = new LinkedList<>();

    public void addBook(String book, String author){
        books.add(new Book(book, author));
    }

    public void printBooks() {
        System.out.println(books);
    }

    class Book {

        private String bookName;
        private String authorName;

        public Book(String bookName, String authorName) {
            this.bookName = bookName;
            this.authorName = authorName;
        }

        @Override
        public String toString() {
            return "All books: {" +
                    "bookName='" + bookName + '\'' +
                    ", author='" + authorName + '\'' +
                    '}';
        }
    }
}

class TestBook {

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Java for beginners", "Herbert Shield");
        library.addBook("Linux", "John");
        library.addBook("Html", "GPT");
        library.printBooks();
    }
}