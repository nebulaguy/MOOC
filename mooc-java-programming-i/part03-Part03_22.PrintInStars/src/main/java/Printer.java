
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int counter = 0;
            while (counter < array[i]) {
                System.out.print("*");
                counter++;
            }
            System.out.println("");
            
        }
            
    }

}
