
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = {3, -1, 8, 4};

        System.out.println(sum(numbers, 0, 0, 0, 0));
        System.out.println(sum(numbers, 0, 0, 0, 10));
        System.out.println(sum(numbers, 0, 1, 0, 10));
        System.out.println(sum(numbers, 0, 1, -10, 10));
        System.out.println(sum(numbers, -1, 999, -10, 10));

    }
    
    public static int sum
        (int[] array, int start, int stop, int smallest, int largest) {
            
            int total = 0;
            for(int i = 0; i < array.length; i++) {
                if(i >= start && i <= stop) {
                    if(array[i] >= smallest && array[i] <= largest) {
                    total = total + array[i];
                }
            }                          
        }
        return total;       
    }

}
