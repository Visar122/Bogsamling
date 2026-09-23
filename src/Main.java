import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library("Min Bogsamling");

        boolean running = true;

        while (running) {
            System.out.println("Tilføj bog 1:");
            System.out.println("Vis alle bøger 2 :");
            System.out.println("Find bog 3:");
            System.out.println("Marker bog som læst 4:");
            System.out.println("Vis ulæste bøger 5 :");
            System.out.println("Afslut 6:");
            System.out.print("Vælg:");
            int valg = scanner.nextInt();
            scanner.nextLine();

            switch (valg) {
                case 1: {
                    System.out.println("Titel :");
                    String title = scanner.nextLine();
                    System.out.println("Author :");
                    String author = scanner.nextLine();
                    System.out.println("Publication Year :");
                    int publicationyear = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Genre  " + "   FANTASY,\n" + " CRIME,\n" + "SCIENCE_FICTION,\n" + " HISTORY,\n" + "BIOGRAPHY:");
                    String genreinput = scanner.nextLine();
                    Book.Genre genre = Book.Genre.valueOf(genreinput.toUpperCase());
                    library.addBook(new Book(title, author, publicationyear, genre));
                    System.out.println("Book added :");
                    break;
                }

                case 2: {
                    library.printBooks();

                    break;
                }

                case 3: {
                    System.out.println("Book Titel :");
                    String searchtitle = scanner.nextLine();
                    Book found = library.findBookByTitle(searchtitle);
                    if (found != null) {
                        found.printInfo();

                    } else {
                        System.out.println("Der findes ingen bog: " + searchtitle);
                    }
                    break;
                }

                case 4: {
                    System.out.print("Titel på bogen der skal markeres som læst: ");
                    String readTitle = scanner.nextLine();

                    if (library.MarkAsRead(readTitle)) {
                        System.out.println("Bogen er markeret som læst");
                    } else {
                        System.out.println("Der findes ingen bog: " + readTitle);
                    }
                    break;
                }
                case 5:{
                    library.printUnreadBooks();
                    break;

                }
                case 6:{
                    running=false;
                    System.out.println("Farvel");
                    break;
                }


            }

        }
    }
}