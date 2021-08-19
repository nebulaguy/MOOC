import java.util.Map;
import java.util.HashMap;

public class MainProgram {

    public static void main(String[] args) {
        Map<String, String> names = new HashMap<>();
        names.put("1", "vrishank");
        names.put("2", "bangari");

        System.out.println(returnSize(names));
    }

    public static int returnSize(Map<String, String> map) {
        return map.size();
    }
}
