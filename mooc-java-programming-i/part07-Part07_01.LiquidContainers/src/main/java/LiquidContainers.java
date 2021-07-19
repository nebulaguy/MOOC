
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int cont1 = 0, cont2 = 0;

        while (true) {
            System.out.println("First: " + cont1 + "/100");
            System.out.println("Second: " + cont2 + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            
            if (command.equals("add")) {
                
                if (amount < 0) {
                    continue;
                }                
                cont1 = cont1 + amount;
                if (cont1 > 100) {
                    cont1 = 100;
                }   
                System.out.println("");
                
            }
            
            if (command.equals("move")) {
                
                if (amount < 0) {
                    continue;
                }
                
                if (amount > cont1) {
                    cont2 = cont2 + cont1;
                    cont1 = 0;
                    System.out.println("");
                    continue;
                }
                cont1 = cont1 - amount;
                cont2 = cont2 + amount;
                if (cont1 > 100) {
                    cont1 = 100;
                }  
                
                if (cont1 < 0) {
                    cont1 = 0;
                }
                if (cont2 > 100) {
                    cont2 = 100;
                }  
                System.out.println("");
                
            }
            
            if (command.equals("remove")) {
                
                if (amount < 0) {
                    continue;
                }
                
                cont2 = cont2 - amount;
                if (cont2 < 0) {
                    cont2 = 0;
                }
                System.out.println("");
            }
            
            
        }
    }

}
