import java.util.ArrayList;

public class Pipe<T> {
    private ArrayList<T> pipe;
    
    public Pipe() {
        this.pipe = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.pipe.add(value);
    }
    
    public T takeFromPipe() {
        T item = null;
        if(this.pipe.isEmpty()) {
            return null;
        }
        
        item = this.pipe.get(0);
        this.pipe.remove(item);
        return item;
    }
    
    public boolean isInPipe() {
        if(!(this.pipe.isEmpty())) {
            return true;
        }
        return false;
    }
    
}
