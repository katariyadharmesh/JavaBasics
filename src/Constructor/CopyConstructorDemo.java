package Constructor;

public class CopyConstructorDemo
{
    String title;
    String author;
    int pages;

    // Parameterized constructor
    public CopyConstructorDemo(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Copy constructor
    public CopyConstructorDemo(CopyConstructorDemo original) {
        this.title = original.title;
        this.author = original.author;
        this.pages = original.pages;
    }

    public static void main(String[] args) {
        CopyConstructorDemo ccd1 = new CopyConstructorDemo("Java Programming", "James Gosling", 500);
        CopyConstructorDemo ccd2 = new CopyConstructorDemo(ccd1); // Copy constructor called

        System.out.println("Book1: " + ccd1.title);
        System.out.println("Book2 (copy): " + ccd2.title);
    }
}
