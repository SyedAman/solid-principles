import java.util.List;

public class CouponCatalog implements Catalog {
    private void displayCouponNames(List<String> couponNames) {
        for (String couponName : couponNames) {
            System.out.println(couponName);
        }
    }

    @Override
    public void listAllItems() {
        CouponRepository couponRepository = CouponRepositoryFactory.create();
        List<String> allCouponNames = couponRepository.getAllCouponNames();

        displayCouponNames(allCouponNames);
    }
}
