import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Book> books = new ArrayList<>();
        
        int counter = 0;
        while(true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            
            if(name.isEmpty()) {
                break;
            }
            System.out.print("Input the age recommendation: ");
            int ageRec = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(name, ageRec));                     
            counter++;    
            
        }
        
        System.out.println(counter + " books in total.");
        
        System.out.println("Books:");
        
        Comparator<Book> comparator = Comparator
                        .comparing(Book::getAge)
                        .thenComparing(Book::getName);
        
        Collections.sort(books, comparator);
        
        for(Book book: books) {
            System.out.println(book);
        }
    }
}


