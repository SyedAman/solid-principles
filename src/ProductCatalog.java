import java.util.List;

public class ProductCatalog {
    private void displayProductNames(List<String> productNames) {
        for (String productName : productNames) {
            System.out.println(productName);
        }
    }
    public void listAllProducts() {
        ProductRepository productRepository = ProductRepositoryFactory.create();
        List<String> allProductNames = productRepository.getAllProductNames();

        displayProductNames(allProductNames);
    }
}
