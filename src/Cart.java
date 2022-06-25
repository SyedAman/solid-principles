import java.util.HashMap;
import java.util.Map;

public class Cart {
    Map<String, Integer> cart = new HashMap<String, Integer>();
    int cartSize = 0;

    public void add(Product product) {
        if (cart.containsKey(product.getId())) {
            cart.put(product.getId(), cart.get(product.getId()) + 1);
        }
        else {
            cart.put(product.getId(), 1);
        }
    }
}
