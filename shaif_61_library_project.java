
class library
{
    String[] books;
    int no_of_books;

    library()
    {
        this.books=new String[100];
        this.no_of_books=0;
    }
    void addBook(String book)
    {
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+" has been added");
    }
    void showAvailableBook()
    {
        System.out.println("Available book are:");
        for(String book:this.books)
        {
            if (book==null)
            {
                continue;
            }
            System.out.println("*"+book);
        }
    }
    void issueBook(String book)
    {
        for (int i=0;i<this.books.length;i++)
        {
            if (this.books[i].equals(book))
            {
                System.out.println(book+"book has been issues");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }
    void returnBook(String book)
    {
        addBook(book);
    }
}

public class shaif_61_library_project {
    public static void main(String[] args) {
        library centralLibrary=new library();
        centralLibrary.addBook("Rich dad Poor dad");
        centralLibrary.addBook("Think and grow rich");
        centralLibrary.addBook("Algorithm");
        centralLibrary.addBook("C++");
        centralLibrary.addBook("Java");

        centralLibrary.issueBook("C++");
        centralLibrary.showAvailableBook();

        centralLibrary.returnBook("C++");
        centralLibrary.showAvailableBook();


    }
}
