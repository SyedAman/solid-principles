public class App {
    public static void main(String[] args) {
        Catalog productCatalog = ProductCatalogFactory.create();
        productCatalog.listAllItems();

        Catalog couponCatalog = CouponCatalogFactory.create();
        couponCatalog.listAllItems();
    }
}
