import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            
            if (title.isEmpty()) {
                break;
            }
            
            System.out.println("Pages: ");
            String pages = scanner.nextLine();
            
            System.out.println("Publication year: ");
            String year = scanner.nextLine();
            
            
            books.add(new Book(title, pages, year));
        }
        System.out.println("");
        
        System.out.print("What information will be printed? ");
        String response = scanner.nextLine();
        
        if (response.equals("everything")) {
            for (Book data: books) {
                System.out.println(data);
            }   
        }
        
        if (response.equals("name")) {
            for (Book data: books) {
                System.out.println(data.getName());
            }
        }
    }
}
