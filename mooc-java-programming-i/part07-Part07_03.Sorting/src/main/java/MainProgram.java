
public class MainProgram {

    public static void main(String[] args) {
        
    }
    
    public static int smallest(int[] array) {
        int base = array[0];       
        for (int i = 0; i < array.length; i++) {
            if (base > array[i]) {
                base = array[i];
            }
        }
        
        return base;
    }
    
    public static int indexOfSmallest(int[] array) {
        int base = array[0]; 
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (base > array[i]) {
                base = array[i];
                index = i;
            }
        }
        
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int base = table[startIndex]; 
        int index = startIndex; 
        for (int i = 0; i < table.length; i++) {
            if (i >= startIndex) {
                if (base > table[i]) {
                    base = table[i];
                    index = i;
                } 
            }                                   
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int first = array[index1]; 
        
        array[index1] = array[index2]; 
        array[index2] = first;
    }
    
    public static void sort(int[] array) {
        
        int smallest = array[0];
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int first = array[i]; 
        
                    array[i] = array[j]; 
                    array[j] = first;
                }
            }
        }
    }
    
    
    
    
    
}
