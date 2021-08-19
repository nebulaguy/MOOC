import java.util.ArrayList;

public class Box implements Packable {
    private double max;
    private ArrayList<Packable> item;
    
    public Box(double max) {
        this.max = max;
        this.item = new ArrayList<>();
    }
    
    public double weight() {
        double weight = 0.0;        
        for(Packable items: this.item) {
            weight += items.weight();           
        }
        return weight;           
    }
    
    public void add(Packable item) {
        if(item.weight() + this.weight() < this.max) {
            this.item.add(item);
        }       
    }
    
    public String toString() {
        return "Box: " + this.item.size() + " items, total weight " + this.weight() + " kg";
    }
}
