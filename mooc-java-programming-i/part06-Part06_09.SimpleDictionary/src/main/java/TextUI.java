
import java.util.Scanner;
import java.util.ArrayList;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary object) {
        this.scanner = scanner;
        this.dictionary = object;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String input = this.scanner.nextLine();

            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (input.equals("add")) {
                System.out.print("Word: ");
                String word = this.scanner.nextLine();
                System.out.print("Translation: ");
                String translation = this.scanner.nextLine();
                this.dictionary.add(word, translation);
                continue;
            }

            if (input.equals("search")) {
                System.out.println("To be translated: ");
                String lated = this.scanner.nextLine();
                if (this.dictionary.translate(lated) == null) {
                    System.out.println("Word " + lated + " was not found.");
                } else {
                    System.out.println("To be translated: " + this.dictionary.translate(lated));
                    continue;
                }
            }

            System.out.println("Unknown command");
        }
    }
}
