
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        
        while (true){
            int numba = Integer.valueOf(scanner.nextLine());
            if (numba == -1) {
                break;
            }
            list.add(numba);
        }
        System.out.println("");

        int x = 0;
        for (Integer joe: list) {
            x = x + joe;
        }
        System.out.println("Average: " + (float)x/(list.size()));
        
    }
}
