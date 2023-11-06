package week5;
import java.util.ArrayList;
import java.util.List;
interface ToBeStored {
    double weight();
}

class Book implements ToBeStored {
    private String writer;
    private String name;
    private double weight;

    public Book(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return writer + ": " + name ;
    }
}

class CD implements ToBeStored {
    private String artist;
    private String title;
    private int publishingYear;
    private double weight = 0.1;

    public CD(String artist, String title, int publishingYear) {
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return  artist + " : " + title +" (" + publishingYear + ")";
    }
}
class Box {

        private double maximumWeight;
        private List<ToBeStored> items;

        public Box(double maximumWeight) {
            this.maximumWeight = maximumWeight;
            this.items = new ArrayList<>();
        }

        public void add(ToBeStored item) {
            if (item.weight() + totalWeight() <= maximumWeight) {
                items.add(item);
            }
        }

        private double totalWeight() {
            double totalWeight = 0;
            for (ToBeStored item : items) {
                totalWeight += item.weight();
            }
            return totalWeight;
        }

        @Override
        public String toString() {
            return "Box: " + items.size() + " things, total weight " + totalWeight() + " kg";
        }
    }


class Main2 {
    public static void main(String[] args) {
        Box box = new Box(10);
        box.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.5));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Tendezvous Park", "Closer to being here", 2012));

        Book book1 = new Book("Fedor Dostojevski", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.5);
        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Tendezvous Park", "Closer to being here", 2012);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(cd1);
        System.out.println(cd2);
        System.out.println(cd3);
        System.out.println(box);
    }
}
