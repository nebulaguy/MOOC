import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> price;
    private Map<String, Integer> stock;
    
    public Warehouse() {
        this.price = new HashMap<>();
        this.stock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        this.price.put(product, price);
        this.stock.put(product, stock);
    }
    
    public int price(String product) {
        if(!(this.price.containsKey(product))) {
            return -99;
        }
        
        return this.price.get(product);
    }
    
    public int stock(String product) {
        if(!(this.stock.containsKey(product))) {
            return 0;
        }
        
        return this.stock.get(product);
    }
    
    public boolean take(String product) {
        if (this.stock.containsKey(product)) {
            int stock = this.stock.get(product);
            if (stock > 0) {
                stock--;
                this.stock.replace(product, stock);
                return true;
            }
        }
        return false;
    }
    
    public Set<String> products() {
        return this.price.keySet();
    }
}
