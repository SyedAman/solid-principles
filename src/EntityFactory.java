import java.util.UUID;

public class EntityFactory {
    public static Product create(String name) {
        return new Product(generateId(), name);
    }

    private static String generateId() {
        return UUID.randomUUID().toString();
    }
}
