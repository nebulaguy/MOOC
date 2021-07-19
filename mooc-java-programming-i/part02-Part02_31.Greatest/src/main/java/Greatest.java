
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        
        int i = number1;
        if (i < number2){
            i = number2;
        } 
        if (i < number3) {
            i = number3;
        }

        return i;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
