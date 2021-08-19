import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history.clear();
    }
    
    public String toString() {
        return String.valueOf(this.history);
    }
    
    public double maxValue() {
        
        if (this.history.isEmpty()) {
            return 0;
        }
        
        double max = this.history.get(0);
        for(Double x: history) {
            if(x > max) {
                max = x;
            }
        }
        return max;
    }
    
    public double minValue() {
        
        if (this.history.isEmpty()) {
            return 0;
        }
        
        double min = this.history.get(0);
        for(Double x: history) {
            if(x < min) {
                min = x;
            }
        }
        return min;
    }
    
    public double average() {
        
        if (this.history.isEmpty()) {
            return 0;
        }
        
        double total = 0;
        int counter = 0;
        for(Double x: history) {    
            total = total + x;
            counter++;
        }
        double average = total/counter;
        return average;
    }
}
