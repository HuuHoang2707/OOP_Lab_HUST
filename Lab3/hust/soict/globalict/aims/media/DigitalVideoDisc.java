package hust.soict.globalict.aims.media;


public class DigitalVideoDisc extends Media implements Playable{
    private String director;
    private int length;

    public boolean equals(DigitalVideoDisc b) {
        return (super.getTitle() == b.getTitle() && super.getCategory() == b.getCategory()&& this.getDirector() == b.getDirector() && this.getLength() == b.getLength() && this.getCost() == b.getCost());
    }

    public DigitalVideoDisc(String title) {
    	super(title);
    }
    
    public DigitalVideoDisc(String title, String category, float cost) {
    	super (title, category, cost);
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        super (category, title, cost);
        this.director = director;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
    	super (category, title, cost);
    	this.director = director;
    	this.length = length;
    }

    public String getDirector () {
        return director;
    }

    public int getLength () {
        return length;
    }

    public void displayDVD() {
        System.out.println("Title: " + super.getTitle());
        System.out.println("Category: " + super.getCategory());
        System.out.println("Director: " + director);
        System.out.println("Length: " + length);
        System.out.println("Cost: " + super.getCost());
    }

    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}