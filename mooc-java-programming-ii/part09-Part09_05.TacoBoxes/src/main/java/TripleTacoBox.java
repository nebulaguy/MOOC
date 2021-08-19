
public class TripleTacoBox implements TacoBox {
    private int number;
    
    public TripleTacoBox() {
        this.number = 3;
    }
    
    public int tacosRemaining() {
        return this.number;
    }
    
    public void eat() {
        this.number--;
        if (this.number < 0) {
            this.number = 0;
        }       
    }
}
