package hust.soict.globalict.aims.store;
import hust.soict.globalict.aims.media.*;
import java.util.ArrayList;


public class store {
	public ArrayList <Media> itemsInStore = new ArrayList<Media>();
	public void addDVD(Media a) {
		itemsInStore.add(a);
	}
    public void removeDVD(Media a) {
        for (Media it : itemsInStore) {
            if (it.getId() == a.getId()) {
                itemsInStore.remove(it);
                break;
            }
        }
    }
    
    public void showMedia(int id) {
    	for (Media it : itemsInStore) {
    		if (it.getId() == id) {
    			it.displayMedia();
    			break;
    		}
    	}
    }
    
    public Media findMedia(int id) {
    	for (Media it : itemsInStore) {
    		if (it.getId() == id) {
    			return it;
    		}
    	}
    	return null;
    }
}
