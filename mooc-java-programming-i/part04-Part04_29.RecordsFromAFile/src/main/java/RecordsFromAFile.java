
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of file: ");
        String fileName = scanner.nextLine();
        
        try (Scanner reader = new Scanner(Paths.get(fileName))) {
            
            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                
                String[] parts = row.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                
                System.out.print(name + ", age: ");
                if (age == 1) {
                    System.out.println(age + " year");
                } else {
                    System.out.println(age + " years");
                }
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
