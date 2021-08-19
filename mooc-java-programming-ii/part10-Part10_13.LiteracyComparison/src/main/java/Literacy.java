
public class Literacy {
    private String name;
    private String gender;
    private int year;
    private double rate;
    
    public Literacy(String name, int year, String gender, double rate) {
        this.name = name;
        this.year = year;
        gender = gender.trim();
        gender = gender.replaceAll("[(%) ]","");
        this.gender = gender;     
        this.rate = rate;              
    }
    
    public double getRate() {
        return this.rate;
    }
    
    @Override
    public String toString() {
        return this.name +" (" + this.year + "), " + this.gender + ", " + this.rate;
    }
}
