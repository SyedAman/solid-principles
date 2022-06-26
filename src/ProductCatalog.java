import java.util.List;

public class ProductCatalog implements Catalog {
    private void displayProductNames(List<String> productNames) {
        for (String productName : productNames) {
            System.out.println(productName);
        }
    }
    public void listAllItems() {
        ProductRepository productRepository = SQLProductRepositoryFactory.create();
        List<String> allProductNames = productRepository.getAllProductNames();

        displayProductNames(allProductNames);
    }
}
