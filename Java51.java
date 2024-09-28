// Day : 51 Exercise : 04 Online Library : Solution by Me :

class Library 
{
    // Properties to store available and issued books
    private String[] availableBooks;
    private String[] issuedBooks;
    private int availableCount;
    private int issuedCount;

    // Constructor to initialize the library with a certain capacity
    public Library(int capacity) 
    {
        availableBooks = new String[capacity]; // Array to store available books
        issuedBooks = new String[capacity];    // Array to store issued books
        availableCount = 0; // Count of available books
        issuedCount = 0;    // Count of issued books
    }

    // Method to add a book to the library
    public void addBook(String book) 
    {
        if (availableCount < availableBooks.length)
        {
            availableBooks[availableCount] = book; // Add book to availableBooks array
            availableCount++;
            System.out.println(book + " has been added to the library.");
        } 
        else 
        {
            System.out.println("Library is full, cannot add more books.");
        }
    }

    // Method to issue a book from the library
    public void issueBook(String book) 
    {
        for (int i = 0; i < availableCount; i++) 
        {
            if (availableBooks[i].equals(book))
            {
                // Move the book to issuedBooks array
                issuedBooks[issuedCount] = book;
                issuedCount++;
                // Remove the book from availableBooks array
                availableBooks[i] = availableBooks[availableCount - 1];
                availableBooks[availableCount - 1] = null; // Clean the last slot
                availableCount--;
                System.out.println(book + " has been issued.");
                return;
            }
        }
        System.out.println(book + " is not available in the library.");
    }

    // Method to return a book to the library
    public void returnBook(String book) 
    {
        for (int i = 0; i < issuedCount; i++) 
        {
            if (issuedBooks[i].equals(book)) 
            {
                // Move the book back to availableBooks array
                availableBooks[availableCount] = book;
                availableCount++;
                // Remove the book from issuedBooks array
                issuedBooks[i] = issuedBooks[issuedCount - 1];
                issuedBooks[issuedCount - 1] = null; // Clean the last slot
                issuedCount--;
                System.out.println(book + " has been returned to the library.");
                return;
            }
        }
        System.out.println(book + " was not issued from this library.");
    }

    // Method to show the list of available books
    public void showAvailableBooks() 
    {
        if (availableCount == 0)
        {
            System.out.println("No books are available in the library.");
        } 
        else 
        {
            System.out.println("Available books in the library:");
            for (int i = 0; i < availableCount; i++)
            {
                System.out.println((i + 1) + ". " + availableBooks[i]);
            }
        }
    }

    // Method to show issued books (optional, useful for tracking)
    public void showIssuedBooks() 
    {
        if (issuedCount == 0) 
        {
            System.out.println("No books are issued.");
        } 
        else
        {
            System.out.println("Issued books:");
            for (int i = 0; i < issuedCount; i++)
            {
                System.out.println((i + 1) + ". " + issuedBooks[i]);
            }
        }
    }
}
public class Java51
{
    public static void main(String[] args)
    {
        Library library = new Library(10);  // Create a library with capacity for 10 books

        // Add books to the library
        library.addBook("Invisible Man");
        library.addBook("Three Man in a Boat");
        library.addBook("Gulliver Travel");
        library.addBook("Hellin Killer");

        // Show available books
        library.showAvailableBooks();

        // Issue a book
        library.issueBook("Gulliver Travel");

        // Show available and issued books after issuing
        library.showAvailableBooks();
        library.showIssuedBooks();

        // Return the book
        library.returnBook("Gulliver Travel");

        // Show available and issued books after returning
        library.showAvailableBooks();
        library.showIssuedBooks();
    }
}
