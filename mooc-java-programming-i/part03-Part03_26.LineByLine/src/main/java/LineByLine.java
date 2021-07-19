
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String story = String.valueOf(scanner.nextLine());
            if (story.equals("")){
                break;
            }
            
            String[] words = story.split(" ");
            
            for (String word : words) {
                System.out.println(word);
            }   
        }
    }
}
