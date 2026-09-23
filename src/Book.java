public class Book {

    public String title;
    private String author;
    private int publicationYear;
    private boolean read;
    private Genre genre;
    public enum Genre {
        FANTASY,
        CRIME,
        SCIENCE_FICTION,
        HISTORY,
        BIOGRAPHY
    }

    public Book(String title,String author,int publicationuear,Genre genre ){
        this.title=title;
        this.author=author;
        this.publicationYear=publicationuear;
        this.read=false;
        this.genre=genre;



    }
    public String getAuthor() {
        return author;
    }
   public String toString(){
       return title + " by " + author + " (" + publicationYear + ")";
   }

    public void markAsRead(){
        this.read=true;
    }

    public void markAsUnread(){
        this.read=false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isRead(){

        return  read;
    }

    public boolean isClassic(int currentYear) {
        int age = currentYear - publicationYear;
        return age > 20;
    }
    public Genre GetGenre(){
        return genre;
    }

   public void printInfo(){
        System.out.println("Titel: " + title);
       System.out.println("Forfatter: " + author);
       System.out.println("Udgivelsesår: " + publicationYear);
       System.out.println("Genre: " + genre);
       if(!read){
           System.out.println("Bog er ikke læst");
           System.out.println();
           return;
       }
       System.out.println("Bog læst");

       System.out.println();
   }

}
