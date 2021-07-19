
public class Timer {
    
    private int hundreths;
    private int seconds;
    
    public Timer() {
        this.hundreths = 0;
        this.seconds = 0;
    }
    
    public void advance() {
        this.hundreths++;
        if (this.hundreths >= 100) {
            this.hundreths = 0;
            this.seconds++;
        }
        if (this.seconds >= 60) {
            this.seconds = 0;
        }
    }
    
    @Override
    public String toString() {
        String x = String.valueOf(this.hundreths);
        String y = String.valueOf(this.seconds);
        if (this.hundreths < 10) {
            x = "0" + this.hundreths;
        }
        if (this.seconds < 10) {
            y = "0" + this.seconds;
        }
        return y + ":" + x;
    }
    
    
}
