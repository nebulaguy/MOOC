
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter point totals, -1 stops: ");
        
        int counter = 0; 
        float total = 0;
        float passing = 0;
        float pCounter = 0;
        int five = 0, four = 0, three = 0, two = 0, one = 0, failed = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            } else if (input < 0 || input > 100) {
                continue;
            }
            
            total = total + input;
            counter++;  
            
            if (input >= 50 && input <= 100) {
                passing = passing + input;
                pCounter++;
            }
            
            if (input >= 90) {
                five++;
            } else if (input < 90 && input >= 80) {
                four++;
            } else if (input < 80 && input >= 70) {
                three++;
            } else if (input < 70 && input >= 60) {
                two++;
            } else if (input < 60 && input >= 50) {
                one++;
            } else if (input < 50 && input >= 0) {
                failed++;
            }                       
        }
        
        System.out.println("Point average (all): " + total/counter);
        
        if (pCounter > 0) {
            System.out.println("Point average (passing): " + passing/pCounter);
            
        } else {
            System.out.println("Point average (passing): -");
        }
        
        System.out.println("Pass percentage: " + 100 * (pCounter/counter));
        
        System.out.print("5: ");
        for (int i = 0; i < five; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("4: ");
        for (int i = 0; i < four; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("3: ");
        for (int i = 0; i < three; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("2: ");
        for (int i = 0; i < two; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("1: ");
        for (int i = 0; i < one; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("0: ");
        for (int i = 0; i < failed; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
