
public class Gift {
    private int weight;
    private String name;
    
    public Gift(String giftName, int giftWeight){
        this.weight = giftWeight;
        this.name = giftName;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getWeight(){ 
        return this.weight;
    }
    
    public String toString() {
        return this.name + "(" + this.weight + " kg)";
    }
}
