package hust.soict.globalict.aims;
import hust.soict.globalict.aims.cart.*;
import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.store.*;
import java.util.Scanner;

public class aims {
	public static void showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}
	
	public static void storeMenu() {

		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");

	}
	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter media in cart");
		System.out.println("2. Sort media in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
		}
	
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int option = 1;
    	Cart userCart = new Cart();
    	store Store = new store();
 		int id;
    	do {
    		showMenu();
    		option = input.nextInt();
    		switch  (option) {
    		case 1: 
    			int opt = 1;
    			do {
    				storeMenu();
    				opt = input.nextInt();
    				switch (opt) {
    				case 1:
    					System.out.print("Enter media Id");
    					id = input.nextInt();
    					Store.showMedia(id);
    					break;
    
    				case 2:
    					System.out.print("Enter media Id");
    					id = input.nextInt();
    					if (Store.findMedia(id) != null) {
    						userCart.addMedia(Store.findMedia(id));
    					}
    					else {
    						System.out.print("There is no item have the id" + id);
    					}
    					break;
    					
    				case 3:
    					System.out.print("Enter media Id");
    					id = input.nextInt();
    					Media tmp = Store.findMedia(id);
    					if (tmp instanceof CompactDisc) {
    						((CompactDisc) tmp).play();
    					}
    					else if (tmp instanceof DigitalVideoDisc) {
    						((DigitalVideoDisc) tmp).play();
    					}
    					break;
    				case 4:
    					userCart.displayCart();
    					break;
    				}
    			} while (opt != 0);
    			break;
    		case 2: 
    			System.out.println("Options: ");
    			System.out.println("--------------------------------");
    			System.out.println("1. Add a media to Store");
    			System.out.println("2. Remove a media from Store");
    			System.out.println("--------------------------------");
    			System.out.println("Please choose a number: 0-1-2");
    			id = input.nextInt();
    			
    			if (id == 1) {
    				CompactDisc a = new CompactDisc("Hoang");
    				Store.addDVD(a);
    			}
    			else {
    				CompactDisc a = new CompactDisc("Hoang");
    				Store.removeDVD(a);
    			}
    			break;
    			
    		case 3:
    			int op = 1;
    			do {
    				cartMenu();
    				op = input.nextInt();
    				switch (op) {
    				case 1: 
    					break;
    				case 2:
    					userCart.sortByCostTitle();
    					break;
    				case 3:
    					userCart.removeMedia(null);
    				case 4:
    					break;  					
    				}
    			} while (op != 0);
    		}
    	} while (option != 0);
    	
    	input.close();
    }
}