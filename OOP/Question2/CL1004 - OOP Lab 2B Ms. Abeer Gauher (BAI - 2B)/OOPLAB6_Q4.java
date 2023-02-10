class Book
{
    protected String bookAuthor, bookName;
    protected int bookId, ISBN;
    Book(String bookAuthor, String bookName, int bookId, int ISBN)
    {
        this.bookAuthor = bookAuthor;
        this.bookId = bookId;
        this.bookName = bookName;
        this.ISBN = ISBN;
    }
    public void display()
    {
        System.out.println("Book author " + bookAuthor);
        System.out.println("book id " + bookId);
        System.out.println("book name " + bookName);
        System.out.println("book ISBN " + ISBN);
    }
}
class Category1 extends Book
{
    String category;
        Category1(String category)
        {
            super("Paul Deitel", "java how to program", 1234, 4533433);
            this.category = "java";
        }
}
public class OOPLAB6_Q4 {
    public static void main(String[] args) {
         Book a = new Category1("JAVA");
        Category1 b = (Category1) a;
          Book a1 = new Book("Paul Deitel", "java how to program", 1234, 4533433);
          Book a2 = new Book("Dietel", "java learn", 12754, 45332253);
          Book a3 = new Book("harvey", "java programing", 1234, 33433);
        System.out.println("book 1 ");
         b.display();
        System.out.println("book 2 ");
          a2.display();
        System.out.println("book 3 ");
          a3.display();
    }

}
