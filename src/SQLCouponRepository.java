import java.util.Arrays;
import java.util.List;

public class SQLCouponRepository implements CouponRepository {

    @Override
    public List<String> getAllCouponNames() {
        return Arrays.asList("First Order", "We're Sorry Perk", "10% Off");
    }
}
