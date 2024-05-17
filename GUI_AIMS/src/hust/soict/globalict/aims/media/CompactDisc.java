package hust.soict.globalict.aims.media;
import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

// Constructor
    public String getArtist() {
        return this.artist;
    }

    public CompactDisc(String title) { 
    	super(title);
    }
    
    public CompactDisc(String title, String category, float cost, String artist) {
    	super (title, category, cost);
        this.artist = artist;
    }

    public CompactDisc(String director, String category, String title, float cost, String artist) {
        super (director, category, title, cost);
        this.artist = artist;
    }

    public CompactDisc(String title, String category, String director, int length, float cost, String artist) {
    	super (title, category, director, length, cost);
        this.artist = artist;
    }
// Add & Remove track
    public void addTrack(Track a) {
        int ok = 0;
        for (Track it : tracks) {
            if (it.equals(a) == true) {
                ok = 1;
                System.out.println("This track have store before!");
                break;
            }
        }
        if (ok == 0) {
            tracks.add(a);
        }
    }

    public void removeTrack(Track a) {
        for (Track it : tracks) {
            if (it.equals(a) == true) {
                tracks.remove(a);
                break;
            }
        }
    }

    public int getLength() {
        int sum = 0;
        for (Track it : tracks) {
            sum += it.getLength();
        }
        return sum;
    }
// Playable
    public void play() {
        System.out.println("CD going to be played:\n");
        for (Track it : tracks) {
            it.play();
        }
    }
}
