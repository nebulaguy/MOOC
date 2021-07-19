
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Value of the gift:");
        int price = Integer.valueOf(scan.nextLine());
        
        if (price < 5000) {
            System.out.println("No tax");
        } else if (5000 <= price && price <= 25000) {
            System.out.println(((price - 5000)*0.08) + 100);
        } else if (25000 <= price && price <= 55000) {
            System.out.println(((price - 25000)*0.1) + 1700);
        } else if (55000 <= price && price <= 200000) {
            System.out.println(((price - 55000)*0.12) + 4700);
        } else if (200000 <= price && price <= 1000000) {
            System.out.println(((price - 200000)*0.15) + 22100);
        } else if (price >= 1000000) {
            System.out.println(((price - 1000000)*0.17) + 142100);
        }
    }
}
