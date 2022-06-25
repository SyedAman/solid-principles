public class Product {
    String id;
    String name;

    public Product(String id) {
        this.id = id;
    }

    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
