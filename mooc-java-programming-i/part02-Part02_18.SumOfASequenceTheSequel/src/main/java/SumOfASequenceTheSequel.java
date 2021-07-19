
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("First number? ");
        int first = Integer.valueOf(scanner.nextLine());
        
        System.out.print("Last number? ");
        int number = Integer.valueOf(scanner.nextLine());
        
        int sum = first;
        for (int i = first + 1; i <= number; i++) {
            sum = sum + i;
        }
        
        System.out.println(sum);
    }
}
