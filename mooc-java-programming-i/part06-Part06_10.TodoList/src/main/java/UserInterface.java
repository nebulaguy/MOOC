import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = list;
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String input = this.scanner.nextLine();
            
            if (input.equals("stop")) {
                break;
            }
            
            if (input.equals("add")) {
                System.out.print("To add: ");
                String answer = this.scanner.nextLine();
                this.todoList.add(answer);
            }
            
            if (input.equals("list")) {
                this.todoList.print();
            }
            
            if (input.equals("remove")) {
                System.out.println("Which one is removed? ");
                int x = Integer.valueOf(this.scanner.nextLine());
                
                this.todoList.remove(x);
            }
        }
    }
}
