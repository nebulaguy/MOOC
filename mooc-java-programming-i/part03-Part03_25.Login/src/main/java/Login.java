
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String user = String.valueOf(scanner.nextLine());
        System.out.print("Enter password: ");
        String password = String.valueOf(scanner.nextLine());
        
        String user1 = "alex";
        String pwd1 = "sunshine";
        String user2 = "emma";
        String pwd2 = "haskell";
        
        if(user.equals(user1) && password.equals(pwd1)){
            System.out.println("You have successfully logged in!");
        } else if (user.equals(user2) && password.equals(pwd2)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
            
    }
}
