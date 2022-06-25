import java.util.HashMap;
import java.util.Map;

public class SQLProductRepository {
    private Map<String, Product> products = new HashMap<>();

    String create(String name) {
        Product product = ProductFactory.create(name);
        products.put(product.getId(), product);
        return product.getId();
    }

    Product get(String id) {
        return products.get(id);
    }

    void put(Product product) {
        products.put(product.getId(), product);
    }

    void remove(String id) {
        products.remove(id);
    }

    String[] getAllProductNames() {
        String[] productNames = new String[products.size()];
        int i = 0;
        for (Product product : products.values()) {
            productNames[i] = product.getName();
            i++;
        }
        return productNames;
    }
}
