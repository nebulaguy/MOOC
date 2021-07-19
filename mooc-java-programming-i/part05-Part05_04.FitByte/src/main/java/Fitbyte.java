
public class Fitbyte {
    private int age;
    private int rate;
    
    public Fitbyte(int ageOf, int heartRate) {
        this.age = ageOf;
        this.rate = heartRate;
    }
    
    public double targetHeartRate(double PercentageOfMaximum) { 
        double target;
        double maxRate = 206.3 - (0.711 * this.age);
        target = (maxRate - this.rate) * (PercentageOfMaximum) + this.rate;
        return target;
    }
}
