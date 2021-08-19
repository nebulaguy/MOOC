import java.util.ArrayList;
 
 
public class HashMap<K, V> {
 
    private ArrayList<Pair<K, V>>[] values;
    private int usedSlots;
 
    public HashMap() {
        this.values = new ArrayList[32];
        this.usedSlots = 0;
    }
 
    public V get(K key) {
        int hashValue = hashValueOf(key);
        if (this.values[hashValue] == null) {
            return null;
        }
 
        ArrayList<Pair<K, V>> valuesAtIndex = this.values[hashValue];
 
        for (int i = 0; i < valuesAtIndex.size(); i++) {
            if (valuesAtIndex.get(i).getKey().equals(key)) {
                return valuesAtIndex.get(i).getValue();
            }
        }
        return null;
    }
 
    public void add(K key, V value) {
        ArrayList<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        int index = getIndexOfKey(valuesAtIndex, key);
 
        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            this.usedSlots++;
        } else {
            valuesAtIndex.get(index).setValue(value);
        }
       
        if (1.0 * this.usedSlots / this.values.length > 0.75) {
            grow();
        }
    }
   
    public V remove(K key) {
        ArrayList<Pair<K, V>> valuesAtIndex = getListBasedOnKey(key);
        if (valuesAtIndex.size() == 0) {
            return null;
        }
       
        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) {
            return null;
        }
       
        Pair<K, V> pair = valuesAtIndex.get(index);
        valuesAtIndex.remove(pair);
        return pair.getValue();
    }
   
    private void grow() {
        ArrayList<Pair<K, V>>[] newValues = new ArrayList[this.values.length * 2];
       
        for (int i = 0; i < this.values.length; i++) {
            copy(newValues, i);
        }
       
        this.values = newValues;
    }
   
    private void copy(ArrayList<Pair<K, V>>[] newArray, int fromIdx) {
        if (this.values[fromIdx] == null) {
            return;
        }
        for (int i = 0; i < this.values[fromIdx].size(); i++) {

            Pair<K, V> newPair = this.values[fromIdx].get(i);

            int hashValue = Math.abs(newPair.getKey().hashCode() % newArray.length);
            if (newArray[hashValue] == null) {
                newArray[hashValue] = new ArrayList<>();
            }

            newArray[hashValue].add(newPair);
        }
    }
 
    private ArrayList<Pair<K, V>> getListBasedOnKey(K key) {
        int hashValue = hashValueOf(key);
        if (values[hashValue] == null) {
            values[hashValue] = new ArrayList<>();
        }
 
        return values[hashValue];
    }
 
    private int getIndexOfKey(ArrayList<Pair<K, V>> myList, K key) {
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1;
    }
 
    private int hashValueOf(K key) {
        int hashValue = Math.abs(key.hashCode() % values.length);
        return hashValue;
    }
}
