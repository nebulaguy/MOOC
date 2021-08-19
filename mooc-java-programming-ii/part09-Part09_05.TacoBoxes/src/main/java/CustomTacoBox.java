
public class CustomTacoBox implements TacoBox {
    private int number;
    
    public CustomTacoBox(int tacos) {
        this.number = tacos;
    }

    public int tacosRemaining() {
        return this.number;
    }

    public void eat() {
        if (this.number > 0) {
            this.number--;
        } 
    }
}
