
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String text = String.valueOf(scanner.nextLine());
            String[] array = text.split(" ");
            
            System.out.println(array[array.length - 1]);
            
            if(text.isEmpty()){
                break;
            }
        }
    }
}
