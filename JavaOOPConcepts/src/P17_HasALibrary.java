class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("  [" + title + "] by " + author);
    }
}

class Library {
    String libraryName;
    Book[] books;
    int count;

    Library(String name, int capacity) {
        libraryName = name;
        books = new Book[capacity];
        count = 0;
    }

    void addBook(Book b) {
        if (count < books.length) {
            books[count++] = b;
        } else {
            System.out.println("Library is full.");
        }
    }

    void showBooks() {
        System.out.println("Books in " + libraryName + ":");
        for (int i = 0; i < count; i++) {
            books[i].display();
        }
    }
}

public class P17_HasALibrary {
    public static void main(String[] args) {
        Library lib = new Library("City Library", 5);
        lib.addBook(new Book("Java Basics", "James"));
        lib.addBook(new Book("Clean Code", "Robert Martin"));
        lib.addBook(new Book("Design Patterns", "GoF"));
        lib.showBooks();
    }
}
