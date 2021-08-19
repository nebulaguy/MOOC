import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

public class ShoppingCart {
    private Map<String, Item> cart;
    
    public ShoppingCart() {
        this.cart = new HashMap<>();
    }
    
    public void add(String product, int price) {
        this.cart.putIfAbsent(product, new Item(product, 0, price));
        this.cart.get(product).increaseQuantity();
        
    }
    
    public int price() {
        Collection<Item> values = this.cart.values();
        int total = 0;
        for(Item value: values) {
            total = total + value.price();            
        }
        
        return total;
    }
    
    public void print() {
        Collection<Item> values = this.cart.values();       
        for(Item value: values) {
            System.out.println(value);          
        }
    }
    
    
}
