
public class Counter {
    private int value;
    
    public Counter(int startValue) {
        this.value = startValue;
    }
    
    public Counter() {
        this.value = 0;
    }
    
    public void increase(int x) {
        if (x > 0) {
            this.value = this.value + x;
        } 
    }
    
    public void decrease(int y) {
        if (y > 0) {
            this.value = this.value - y;
        } 
    }
    
    public void increase() {
        this.value++;
    }
    
    public void decrease() {
        this.value--;
    }
    
    public int value() {
        return this.value;
    }
    
}
