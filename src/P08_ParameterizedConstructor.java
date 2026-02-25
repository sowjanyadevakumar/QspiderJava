class Book {
    String title;
    String author;
    int pages;

    Book(String t, String a, int p) {
        title = t;
        author = a;
        pages = p;
    }

    void show() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
}

public class P08_ParameterizedConstructor {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "James Gosling", 500);
        Book b2 = new Book("Clean Code", "Robert Martin", 431);

        b1.show();
        System.out.println("---");
        b2.show();
    }
}
