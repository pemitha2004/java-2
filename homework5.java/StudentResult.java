public class LibraryBook {

    int bookId;
    String title;
    String author;
    int totalCopies;
    int borrowedCopies;

    public LibraryBook() {
        bookId = 0;
        title = "Unknown";
        author = "Unknown";
        totalCopies = 0;
        borrowedCopies = 0;
    }
    public LibraryBook(int bookId, String title,
                       String author, int totalCopies) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.totalCopies = totalCopies;
        borrowedCopies = 0;
    }

    public String borrowBook(int count) {

        int available = totalCopies - borrowedCopies;

        if (count <= available && count > 0) {

            borrowedCopies += count;

            int remaining = totalCopies - borrowedCopies;

            return "Successfully borrowed " + count
                    + " copy/copies. Remaining: " + remaining;

        } else {

            return "Only " + available
                    + " copy/copies available.";
        }
    }

    public void returnBook(int count) {

        if (count <= borrowedCopies && count > 0) {

            borrowedCopies -= count;

            System.out.println(
                    "Successfully returned " + count
                    + " copy/copies."
            );

        } else {

            System.out.println(
                    "Return count exceeds borrowed copies."
            );
        }
    }

    public int getAvailableCopies() {

        return totalCopies - borrowedCopies;
    }

    public String getBookInfo(String shelf) {

        return "Book ID: " + bookId +
                "\nTitle: " + title +
                "\nAuthor: " + author +
                "\nTotal Copies: " + totalCopies +
                "\nBorrowed Copies: " + borrowedCopies +
                "\nAvailable Copies: " + getAvailableCopies() +
                "\nShelf: " + shelf;
    }

    public static void main(String[] args) {

        LibraryBook book1 = new LibraryBook();

        LibraryBook book2 = new LibraryBook(
                502,
                "Java Programming",
                "James Gosling",
                5
        );

        System.out.println("Book 2:");
        System.out.println(book2.getBookInfo("A-12"));

        System.out.println(
                "\n" + book2.borrowBook(3)
        );

        System.out.println("\nAfter Borrowing:");
        System.out.println(book2.getBookInfo("A-12"));

        System.out.println(
                "\n" + book2.borrowBook(5)
        );

        book2.returnBook(2);

        System.out.println("\nAfter Returning:");
        System.out.println(book2.getBookInfo("A-12"));

        System.out.println(
                "\n" + book2.borrowBook(1)
        );

        System.out.println("\nFinal Book Information:");
        System.out.println(book2.getBookInfo("A-12"));

        System.out.println("\nDefault Book:");
        System.out.println(book1.getBookInfo("B-01"));
    }
}