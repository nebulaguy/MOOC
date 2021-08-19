
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<Literacy> list = new ArrayList<>();

        try {
            Files.lines(Paths.get("literacy.csv"))                                //reads file
                    .map(line -> line.split(","))                                 //splits file
                    .map(fragment -> new Literacy(fragment[3],                    //adds file to new Literacy object
                            Integer.valueOf(fragment[4]), fragment[2], 
                            Float.valueOf(fragment[5])))
                    .forEach(literacy -> list.add(literacy));                     //adds object to list
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
                
        list.stream().sorted((L1, L2) -> {
            return Double.compare(L1.getRate(), L2.getRate());
        }).forEach(L -> System.out.println(L));       
    }
}
