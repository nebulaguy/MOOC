
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float sum = 0;
        float counter = 0;
        
        while(true) {
            System.out.println("Give a number: ");
            int value = Integer.valueOf(scanner.nextLine());
            
            if (value > 0 || value < 0) {
                sum = sum + value;
                counter = counter + 1;
            } else if (value == 0) {
                break;
            }
        }

        System.out.println("Average of the numbers: "+(sum/counter));
    }
}
