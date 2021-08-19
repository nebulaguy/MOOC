
public class CD implements Packable {
    private String author;
    private String name;
    private double weight;
    private int year;
    
    public CD(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.weight = 0.1;
    }

    public double weight() {
        return weight;
    }
    
    public String toString() {
        return this.author + ": " + this.name + " (" + this.year + ")";
    }
    
    
    
}
