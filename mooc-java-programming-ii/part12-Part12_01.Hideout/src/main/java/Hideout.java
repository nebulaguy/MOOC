import java.util.ArrayList;

public class Hideout<T> {
    private ArrayList<T> hideout;
    
    public Hideout() {
        this.hideout = new ArrayList<>();
    }
    
    public void putIntoHideout(T toHide) {
        if(!(this.hideout.isEmpty())) {
            this.hideout.clear();
        }
        
        this.hideout.add(toHide);
    }
    
    public T takeFromHideout() {
        T item = null;
        if(this.hideout.isEmpty()) {
            return null;
        }
        
        for(T object: this.hideout) {
            item = object;
        }
        this.hideout.clear();   
        return item;
    }
    
    public boolean isInHideout() {
        if(this.hideout.isEmpty()) {
            return false;
        }
        return true;
    }
}
