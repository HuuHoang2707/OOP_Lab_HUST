package week2.Lab2;
import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBER_ORDERED = 20;
    private ArrayList<DigitalVideoDisc> itemOrderd = new ArrayList<>();

    public void addDigitalVideoDisc(DigitalVideoDisc a) {
        itemOrderd.add(a);
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc a) {
        for (DigitalVideoDisc it : itemOrderd) {
            if (it.equals(a)) {
                itemOrderd.remove(it);
                break;
            }
        }
    }

    public float totalCost() {
        float totalCost = 0;
        for (DigitalVideoDisc it : itemOrderd) {
                totalCost += it.getCost();
        }
        return totalCost;
    }

    public void searchByTitle(String title) {
        for (DigitalVideoDisc it : itemOrderd) {
            if (it.getTitle().toLowerCase().indexOf(title.toLowerCase()) != -1) {
                it.displayDVD();
            }
        }
    }
    public void displayCart() {
        for (DigitalVideoDisc it : itemOrderd) {
            it.displayDVD();
            System.out.println('\n');
        }
    }
}
