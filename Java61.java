// Day : 61 Exercise : 04 Online Library : Solution by Tutor :

class Library61
{
    String[] books;
    int noOfBooks;

    Library61()
    {
        this.books = new String[100];
        this.noOfBooks = 0;
    }

    void addBooks(String book)
    {
        this.books[noOfBooks] = book;
        noOfBooks++;
        System.out.println(book + " has been added.");
    }

    void showavailableBook()
    {
        System.out.println("Available Books are : ");
        for(String book : this.books)
        {
            if(book == null)
            {
                continue;
            }

            System.out.println("* " + book);
        }
    }

    void issueBook(String book)
    {
        for(int i = 0; i < this.books.length; i++)
        {
            if(this.books[i].equals(book))
            {
                System.out.println("The book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book doesn't exist!");
    }

    void returnBook(String book)
    {
        this.books[noOfBooks] = book; // or we also use addBooks(); Function
    }
}

public class Java61
{
    public static void main(String[] args)
    {
        // You have to implement a Library using Java Class "Library"
        // Methods : addBook, issueBook, returnBook, showAvailableBooks
        // Properties : Array to store the available books
        // Array to store the issued book

        Library61 centralLibrary = new Library61();
        centralLibrary.addBooks("Invisible Man");
        centralLibrary.addBooks("Three Man in a Boat");
        centralLibrary.addBooks("Gulliver Travel");
        centralLibrary.addBooks("Helen Killer");
        centralLibrary.addBooks("Game Of Thrones");
        centralLibrary.addBooks("Marvel Cinematic");

        System.out.println("-------------------------------------------");

        centralLibrary.showavailableBook();

        System.out.println("-------------------------------------------");

        centralLibrary.issueBook("Gulliver Travel");
        centralLibrary.showavailableBook();

        System.out.println("-------------------------------------------");

        centralLibrary.returnBook("Gulliver Travel");
        centralLibrary.showavailableBook();
    }
}

