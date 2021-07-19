
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give a number: ");
        int max = Integer.valueOf(scanner.nextLine());
        int start = 1;
        for (int i = 1; i <= max; i++) {
            start = start * i;
        }
        
        System.out.println("Factorial: "+start);
    }
}
