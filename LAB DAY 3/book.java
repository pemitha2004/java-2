class Book {
    
    private String title;
    private String author;
    private double price;

    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {

        Book book1 = new Book();

        Book book2 = new Book("Java Programming", "James Gosling", 500.0);

        System.out.println("Book 1:");
        book1.displayDetails();

        System.out.println("Book 2:");
        book2.displayDetails();
    }
}