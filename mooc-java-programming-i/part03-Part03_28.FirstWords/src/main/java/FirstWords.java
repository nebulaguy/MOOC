
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String text = String.valueOf(scanner.nextLine());
            String[] array = text.split(" ");
            
            System.out.println(array[0]);
            
            if(text.isEmpty()){
                break;
            }
        }
    }
}
