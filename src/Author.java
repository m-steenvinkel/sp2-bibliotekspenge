import java.util.ArrayList;

import static java.lang.Math.round;

public class Author {
    private String name;
    private ArrayList<Title> titles;

    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }

    public void addTitle(Title title) {
        titles.add(title);
    }

    public String getName() {
        return name;
    }


    public double calculateRoyalties() {
        double total = 0;
        for (Title title : titles) {
            total += title.calculateRoyalty();
        }
        return Math.round(total); //TODO: find anden måde at afrunde
    }


}
