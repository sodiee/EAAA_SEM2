package Ordre_Discount_Opgave.minihandel;

/**
 * Models a product with a name and a price.
 */
public class Product {
    private int number;
    private String name;
    private double unitPrice;

    /**
     * Create a new product for the order system.
     * @param number a unique number for this product.
     * @param name the name of the product.
     * @param unitPrice the unit price.
     */
    public Product(int number, String name, double unitPrice) {
        this.number = number;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getNumber() {
        return this.number;
    }
    
}
