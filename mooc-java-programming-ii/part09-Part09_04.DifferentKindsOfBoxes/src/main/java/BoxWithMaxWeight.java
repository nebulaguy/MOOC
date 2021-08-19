import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private ArrayList<Item> list;
    private int max;

    public BoxWithMaxWeight(int capacity) {
        this.list = new ArrayList<>();
        this.max = capacity;
    }

    @Override
    public void add(Item item) {
        int actualWeight = this.max;
        
        for (Item addedItem : this.list) {
            actualWeight -= addedItem.getWeight();
        }
        
        if (item.getWeight() <= actualWeight) {
            this.list.add(item);
        }
    }

    @Override
    public boolean isInBox(Item comparedItem) {
        for (Item item : this.list) {
            if (item.equals(comparedItem)) {
                return true;
            }
        }
        return false;
    }
}
    
    
