import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility() {
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        
        ArrayList<String> items = this.storage.get(unit);
        items.add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> tl = new ArrayList<>();
        
        if(this.storage.get(storageUnit) == null) {
            return tl;
        }
        
        return this.storage.get(storageUnit);
    }
    
    public void remove(String storageUnit, String item) {
        this.storage.get(storageUnit).remove(item);
        
        if(this.storage.get(storageUnit).isEmpty()) {
            this.storage.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnits = new ArrayList<>();
        
        for(String unit: this.storage.keySet()) {
            if(!(unit.isEmpty())) {
                storageUnits.add(unit);
            }
        }
        
        return storageUnits;
        
    }
    
}
