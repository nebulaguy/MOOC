
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String line = String.valueOf(scanner.nextLine());
            
            String[] array = line.split(" ");
            
            for (String array1 : array) {
                if (array1.contains("av")) {
                    System.out.println(array1);
                } 
            }
            if (line.isEmpty()) {
                break;
            }
        }
    }
}
