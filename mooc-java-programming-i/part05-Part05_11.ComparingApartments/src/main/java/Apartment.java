
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }
    
    public int priceDifference(Apartment compared) {
        
        int y = compared.squares * compared.pricePerSquare;
        int x = this.squares * this.pricePerSquare;
        
        if (x - y > 0) {
            return x-y;
        } else if (x - y < 0) {
            return (x -y) * -1;
        } else {
            return x-y;
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int y = compared.squares * compared.pricePerSquare;
        int x = this.squares * this.pricePerSquare;
        
        if(x > y) {
            return true;
        } 
        return false;        
    }
}
