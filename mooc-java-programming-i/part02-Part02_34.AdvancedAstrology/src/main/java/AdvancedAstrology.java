
public class AdvancedAstrology {

    public static void printStars(int number) {
        
        for (int i = 0; i < number; i++){
            System.out.print("*");
        }    
        System.out.println("");
    }

    public static void printSpaces(int number) {
        
        for (int i = 0; i < number; i++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        
        for (int h = size - 1; h >= 0; h--) {
            printSpaces(h);
            printStars(size - h);
            //System.out.println("");                
        }
    }

    public static void christmasTree(int height) {
        int x = 0;
        for (int i = height - 1; i >= 0; i--) {
            printSpaces(i);
            printStars(height - i + x);
            x++;
            //System.out.println("");
        }
        for (int i = 0; i <2; i++) {
            printSpaces(height - 2);
            printStars(3);
            //stem.out.println("");
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
