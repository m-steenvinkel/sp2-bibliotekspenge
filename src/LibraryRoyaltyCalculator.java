public class LibraryRoyaltyCalculator {

    public static void main(String[] args) {

        Author author1 = new Author("Cuttlefish");

        author1.addTitle(new PrintedBook("Lord of the Mysteries", "SKØN", 140, 166));
        author1.addTitle(new AudioBook("Throne of Magical Arcana", "SKØN", 140, 192));
        author1.addTitle(new EBook("Circle of Inevitability", "FAG", 97, 50, 205, 360000, false));
        author1.addTitle(new EAudioBook("Embers Ad Infinitum", "FAG", 97, 50, 205, 210));

        System.out.println(author1.getName() + ": " + author1.calculateRoyalties() + "kr");
    }
}
