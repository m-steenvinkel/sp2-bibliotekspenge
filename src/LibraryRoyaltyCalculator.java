public class LibraryRoyaltyCalculator {

    public static void main(String[] args) {

        Author author1 = new Author("Cuttlefish");

        author1.addTitle(new PrintedBook("Lord of the mysteries", "SKØN", 140, 166));
        author1.addTitle(new AudioBook("Throne of magical arcana", "SKØN", 140, 192));

        double authorRoyalties = author1.calculateRoyalties();

        System.out.println(author1.getName() + ": " + authorRoyalties + "kr");
    }
}
