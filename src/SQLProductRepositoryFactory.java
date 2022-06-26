public class SQLProductRepositoryFactory {
    public static ProductRepository create() {
        return new SQLProductRepository();
    }
}
