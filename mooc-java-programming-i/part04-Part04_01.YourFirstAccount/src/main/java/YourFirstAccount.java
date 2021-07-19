
public class YourFirstAccount {

    public static void main(String[] args) {

        Account vrishankAccount = new Account("Vrishank's account", 100.00);
        
        vrishankAccount.deposit(20);
        System.out.println(vrishankAccount);

    }
}
