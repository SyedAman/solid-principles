public class CouponRepositoryFactory {
    public static CouponRepository create() {
        return new SQLCouponRepository();
    }
}
