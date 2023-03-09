package Ordre_Discount_Opgave.minihandel.DiscountStrategy;

public class FixedDiscount implements Discount{
    @Override
    public double getDiscountPrice(double price) {
        double discountPrice = 0;
        if (price > 999) {
            discountPrice = price - 250;
        }
        return discountPrice;
    }
}
