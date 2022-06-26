import java.util.*;


public class SQLProductRepository implements ProductRepository {
    private Map<String, Entity> entities = new HashMap<>();

    String create(String name) {
        Entity entity = EntityFactory.create(name);
        entities.put(entity.getId(), entity);
        return entity.getId();
    }

    Entity get(String id) {
        return entities.get(id);
    }

    void put(Entity product) {
        entities.put(product.getId(), product);
    }

    void remove(String id) {
        entities.remove(id);
    }

    List<String> getAllIds() {
        List<String> ids = new ArrayList<>();
        for (Entity entity : entities.values()) {
            ids.add(entity.getId());
        }
        return ids;
    }

    @Override
    public List<String> getAllProductNames() {
        return Arrays.asList("soap", "toothpaste", "shampoo");

        /**
         * @TODO: implement this method
         * List<String> productNames = new ArrayList<>();
        for (Entity entity : entities.values()) {
            productNames.add(entity.getName());
        }
        return productNames;*/
    }
}
