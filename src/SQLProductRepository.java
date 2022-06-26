import java.util.HashMap;
import java.util.Map;

public class SQLProductRepository {
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

    String[] getAllIds() {
        String[] entityIds = new String[entities.size()];
        int i = 0;
        for (Entity entity : entities.values()) {
            entityIds[i] = entity.getId();
            i++;
        }
        return entityIds;
    }
}
