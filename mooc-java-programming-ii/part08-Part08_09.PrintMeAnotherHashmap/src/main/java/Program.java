
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("pride", 1813, "...."));
        hashmap.put("happy", new Book("Don't let the pigeon drive the bus", 2003, "...."));
        printValueIfNameContains(hashmap, "pre");
    }

    public static void printValues(HashMap<String, Book> hashmap) {
        for (String hm : hashmap.keySet()) {
            System.out.println(hashmap.get(hm).toString());
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book hm : hashmap.values()) {
            if (hm.getName().contains(text)) {
                System.out.println(hm);
            }

        }
    }

}
