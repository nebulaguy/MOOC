
import java.util.ArrayList;

public class Suitcase {

    private int maximum;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maximum = maxWeight;
    }

    public void addItem(Item item) {
        int totalWeight = 0;
        for (Item itm: items) {
            totalWeight = totalWeight + itm.getWeight();
        }

        if (!(this.maximum < totalWeight + item.getWeight())) {
            this.items.add(item);
        }
    }
    
    public void printItems() {
        for (Item itm: items) {
            System.out.println(itm.getName() + "(" + itm.getWeight() + " kg)\n");
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Item itm: items) {
            totalWeight = totalWeight + itm.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviestItem = this.items.get(0);
        
        for (Item itm: this.items) {
            if (itm.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = itm;
            }
        }
        
        return heaviestItem;
    }

    public String toString() {

        String itemReturn = "";
        int x = 0;
        int y = this.items.size();

        for (Item itm : items) {
            x = x + itm.getWeight();
        }

        if (y == 0) {
            return "no items (0 kg)";
        }

        if (y == 1) {
            return y + " item (" + x + " kg)";
        }

        return y + " items (" + x + " kg)";
    }
}
