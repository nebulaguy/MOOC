
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int counter = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            int value = Integer.valueOf(scanner.nextLine());
            
            if (value > 0){
                sum += value;
                counter += 1;
            } else if (value < 0) {
                continue;
            } else {
                break;
            }
        }
        
        float average = (float)sum / counter;
        
        if (counter == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(average);
        }
       
    }
}
