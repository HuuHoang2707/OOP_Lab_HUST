package hust.soict.globalict.aims.media;
import java.util.*;

public abstract class Media{
	
	private	int id;
	private String title;
	private String category;
	private float cost;
	
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MeidaComparatorByCostTitle();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByTitleCost();
    
    public Media(String title) {
        this.title = title;
    }
    
    public Media(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public Media(int id, String category, String title, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.id = id;
    }
    
    public String getTitle() {
    	return title;
    }
    public int getId() {
    	return id;
    }
    public String getCategory() {
    	return category;
    }
    public float getCost() {
    	return cost;
    }
    
    public void displayMedia() {
        System.out.println("ID: " + this.getId());
        System.out.println("Title: " + this.getTitle());
        System.out.println("Category: " + this.getCategory());
        System.out.println("Cost: " + this.getCost());
    }
}

