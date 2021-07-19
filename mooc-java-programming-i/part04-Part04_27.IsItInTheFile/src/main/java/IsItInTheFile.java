
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            int x = 0;
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                if (row.contains(searchedFor)) {
                    System.out.println("Found!");
                    x++;
                    break;
                }
            } 
            if (x == 0) {
                System.out.println("Not found.");
            }
            
        } catch (Exception e) {
            System.out.println("Reading the file nonexistent.txt failed.");
        }
    }
}
