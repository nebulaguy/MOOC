
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++){
            for (int u = 0; u < size; u++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++){
            for (int u = 0; u < width; u++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 0; i < size; i++){
            for (int u = 0 ; u < i + 1; u++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
