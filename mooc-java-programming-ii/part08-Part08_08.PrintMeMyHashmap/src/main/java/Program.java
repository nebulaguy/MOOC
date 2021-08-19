
import java.util.HashMap;

public class Program {

    private HashMap<String, String> print;
    
    public Program() {
        this.print = new HashMap<>();
    }
    
    public static void printKeys(HashMap<String,String> hashmap) {
        
        for(String hm: hashmap.keySet()) {
            System.out.println(hm);
        }       
    }
    
    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        
        for(String hm: hashmap.keySet()) {
            if(hm.contains(text)) {
                System.out.println(hm);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        for(String hm: hashmap.keySet()) {
            if(hm.contains(text)) {
                System.out.println(hashmap.get(hm));
            }
        }
    }
}
