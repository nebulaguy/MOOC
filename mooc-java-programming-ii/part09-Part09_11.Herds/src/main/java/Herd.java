import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private List<Movable> herd;
    
    public Herd() {
        this.herd = new ArrayList<>();
    }
    
    public String toString() {
        String x = "";
        for(Movable item: herd) {
            x =  x + item + "\n";
        }
        return x;
    }
    
    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for(Movable item: herd) {
            item.move(dx, dy);
        }
    }
}
