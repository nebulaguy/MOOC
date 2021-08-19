import java.util.ArrayList;

public class OneItemBox extends Box {
    
    private final int max;
    private ArrayList<Item> item;
    
    public OneItemBox() {
        this.max = 1;
        this.item = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(this.item.isEmpty()) {
            this.item.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if(this.item.contains(item)) {
            return true;
        }
        return false;
    }
    
    
}
