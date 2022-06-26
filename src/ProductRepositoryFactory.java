public class ProductRepositoryFactory {
    public static ProductRepository create() {
        return new SQLProductRepository();
    }
}
