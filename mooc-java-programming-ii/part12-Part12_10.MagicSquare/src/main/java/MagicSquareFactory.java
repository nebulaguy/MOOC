
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        int mid = (int)(size)/2;
        int x = mid;
        int y = 0;
        square.placeValue(x, y, 1);
  
        
        for(int i = 2; i <= size*size; i++) {
            int oy = y;
            int ox = x;
            
            if(y == 0) {
               y = size - 1;
            } else {
                y--;
            }  
            
            if(x == size - 1) {
                x = 0;
            } else {
                x++;
            }
            
            if(square.readValue(x, y) != 0) {
                oy++;
                square.placeValue(ox, oy, i);
                y = oy;
                x = ox;
            } else {
                square.placeValue(x, y, i);
            }            
        }
        
        // implement the creation of a magic square with the Siamese method algorithm here
        return square;
    }

}
