package Ordre_Discount_Opgave.minihandel.DiscountStrategy;

public class PercentDiscount implements Discount{
    @Override
    public double getDiscountPrice(double price) {
        double totalPriceWithDiscount = price - (price * 0.15);
        return totalPriceWithDiscount;
    }
}
