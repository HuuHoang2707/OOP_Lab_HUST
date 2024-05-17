package hust.soict.globalict.aims.cart;
import java.util.ArrayList;
import java.util.*;
import hust.soict.globalict.aims.media.*;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private ArrayList<Media> itemOrderd = new ArrayList<Media>();
    public void addMedia(Media a) {
        if (itemOrderd.size() == 20) {
            System.out.println("The cart quantity reach maximum number!");
        }
        else {
            itemOrderd.add(a);
        }
    }

    public void removeMedia(Media a) {
        for (Media it : itemOrderd) {
            if (it.getId() == a.getId()) {
                itemOrderd.remove(a);
                break;
            }
        }
    }

    public int totalCost() {
        int totalCost=0;
        for (Media it : itemOrderd) {
            totalCost += it.getCost();
        }
        return totalCost;
    }
    
    public void sortByTitleCost() {
    	Collections.sort(itemOrderd, Media.COMPARE_BY_TITLE_COST);
    }
    
    public void sortByCostTitle() {
    	Collections.sort(itemOrderd, Media.COMPARE_BY_COST_TITLE);
    }
    
    public void displayCart() {
    	for (Media it : itemOrderd) {
    		it.displayMedia();
    	}
    }
}

