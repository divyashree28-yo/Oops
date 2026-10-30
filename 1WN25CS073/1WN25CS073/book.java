class Book
{
    int book_id;
    String title, author;
    float price;
    static int totalBook = 0;

    Book(int book_id, String title, String author, float price)
    {
        this.book_id = book_id;
        this.title = title;
        this.author = author;
        this.price = price;

        totalBook++;
    }

    void display()
    {
        System.out.println("Book ID = " + book_id);
        System.out.println("Book Title = " + title);
        System.out.println("Author = " + author);
        System.out.println("Price = " + price);
    }

    void search(int bid)
    {
        if (book_id == bid)
        {
            System.out.println("Book found");
        }
        else
        {
            System.out.println("Book not found");
        }
    }

    void search(int bid, String tit)
    {
        if (book_id == bid && title.equals(tit))
        {
            System.out.println("Book found");
        }
        else
        {
            System.out.println("Book not found");
        }
    }

    Book findCostly(Book b)
    {
        if (price > b.price)
        {
            return this;
        }
        else
        {
            return b;
        }
    }

    public static void main(String args[])
    {
        Book b1 = new Book(101, "Shortstory", "John", 500);
        Book b2 = new Book(102, "Atheist", "Ram", 100);
        Book b3 = new Book(103, "Siddhartha", "Sai", 200);

        b1.search(101);

        b2.search(102, "Atheist");

        Book costly = b1.findCostly(b2);

        System.out.println("Costliest Book:");
        costly.display();

        System.out.println("Total Books = " + Book.totalBook);
    }
}