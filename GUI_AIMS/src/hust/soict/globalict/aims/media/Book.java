package hust.soict.globalict.aims.media;
import java.util.ArrayList;

public class Book extends Media{
	
    public Book(String title) {
    	super(title);
    }
    
    public Book(String title, String category, float cost) {
    	super(title, category, cost);
    }

    public Book(int id, String category, String title, float cost) {
    	super (id, category, title, cost);
    }
    
	private ArrayList<String> authors = new ArrayList<String>();
	
	public void addAuthor (String a) {
		int ok = 0;
		for (String it : authors) {
			if (it == a) {
				ok = 1;
				break;
			}
		}
		if (ok == 1)
			return;
		else authors.add(a);
	}
	
	public void removeAuthor (String a) {
		for (String it : authors) {
			if (it == a) {
				authors.remove(it);
				break;
			}
		}
		return;
	}
	
}