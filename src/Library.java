import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }
    public void addBook(Book book){
        books.add(book);

    }

    public int getNumberOfBooks(){
       int AntalBøger=books.size();
       return  AntalBøger;
    }
   public Book findBookByTitle(String title){
        for (Book book:books){
            if(book.getTitle().equals(title)) {
                return book;
            }
        }

       return null;

    }
    public boolean removeBookByTitle(String title){
        Book book=findBookByTitle(title);
        if (book==null) {
            return false;

        }
        books.remove(book);
        return true;

    }


    public void printUnreadBooks(){
         for (Book book:books){
             if (!book.isRead()){
                 System.out.println("Unread Books : " +book);


             }
         }

    }
    public void printreadBooks(){
        for (Book book:books){
            if (book.isRead()){
                System.out.println("Read Books : " +book);



            }
        }

    }

    public int getNumberOfReadBooks() {
        int count = 0;

        for (Book book : books) {
            if (book.isRead()) {
                count++;
            }
        }

        return count;
    }

    public void printBooksByAuthor(String author){
        boolean found=false;
        for (Book book:books){
            if (book.getAuthor().equals(author)){
                book.printInfo();
                found=true;
            }

        }
        if (!found){
            System.out.println("Der er ingen bøger fra : " + author);
        }

    }
    public boolean MarkAsRead(String title) {
        Book book = findBookByTitle(title);

        if (book == null) {
            return false;
        }

        book.markAsRead();
        return true;
    }


    public void printBooks() {
        System.out.println("Library: " + name);
        System.out.println();

        for (Book book : books) {
            book.printInfo();
        }
    }

    }

