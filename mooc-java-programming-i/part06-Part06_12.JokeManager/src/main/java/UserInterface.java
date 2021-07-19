import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private JokeManager manager;
    
    public UserInterface (JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands: ");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            
            String input = this.scanner.nextLine();
            
            if (input.equals("X")) {
                break;
            }
            
            processor(input);
        }  
    }
    
    public void processor(String input) {
        if (input.equals("1")) {
            System.out.println("Write the joke to be added: ");
            String joke = this.scanner.nextLine();
            this.manager.addJoke(joke);
        }
        
        if (input.equals("2")) {
            System.out.println(this.manager.drawJoke());
        }
        
        if (input.equals("3")) {
            this.manager.printJokes();
        }
    }
}
