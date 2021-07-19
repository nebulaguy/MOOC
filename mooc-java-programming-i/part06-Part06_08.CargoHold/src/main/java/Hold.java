import java.util.ArrayList;

public class Hold {
    private int max;
    private ArrayList<Suitcase> suitcase;
    
    public Hold(int maximum) {
        this.max = maximum;       
        this.suitcase = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase x) {
        int totalWeight = 0;
        for (Suitcase stcse: suitcase) {
            totalWeight = totalWeight + stcse.totalWeight();
        }
        
        if (!(this.max < totalWeight + x.totalWeight())) {
            this.suitcase.add(x);
        }
    } 
    
    public void printItems() {
        for (int i = 0; i < this.suitcase.size(); i++) {
            this.suitcase.get(i).printItems();
        }
    }
    
    public String toString() {
        int totalWeight = 0;
        int y = this.suitcase.size();
        for (Suitcase stcse: suitcase) {
            totalWeight = totalWeight + stcse.totalWeight();
        }
        
        return y + " suitcases (" + totalWeight + " kg)";
    }
}
