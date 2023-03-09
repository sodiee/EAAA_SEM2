package Ordre_Discount_Opgave.minihandel;

import Ordre_Discount_Opgave.minihandel.DiscountStrategy.Discount;
import Ordre_Discount_Opgave.minihandel.DiscountStrategy.FixedDiscount;
import Ordre_Discount_Opgave.minihandel.DiscountStrategy.PercentDiscount;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        /*Product trøje = new Product(5, "Trøje", 250);
        Product sko = new Product(10, "Sko", 500);
        Product kælk = new Product(15, "Kælk", 700);
        Product ske = new Product(17, "Ske", 50);
        Product gaffel = new Product(19, "Gaffel", 39);

        Customer Mikkel = new Customer("Mikkel", LocalDate.of(1995, 7, 16));
        Customer Mads = new Customer("Mads", LocalDate.of(1996, 5, 15));

        Order order1 = new Order(1);
        order1.createOrderLine(5, kælk);
        order1.createOrderLine(6, sko);

        Order order2 = new Order(2);
        order2.createOrderLine(3, trøje);
        order2.createOrderLine(1, gaffel);
        order2.createOrderLine(2, ske);
        order2.createOrderLine(4, sko);

        Order order3 = new Order(3);
        order3.createOrderLine(2, ske);
        order3.createOrderLine(4, sko);

        Order order4 = new Order(4);
        order4.createOrderLine(6, sko);
        order4.createOrderLine(2, ske);

        Order order5 = new Order(5);
        order5.createOrderLine(3, trøje);
        order5.createOrderLine(5, kælk);

        Order order6 = new Order(6);
        order6.createOrderLine(2, ske);
        order6.createOrderLine(5, kælk);
        order6.createOrderLine(4, sko);

        Mikkel.addOrder(order1);
        Mikkel.addOrder(order2);
        Mads.addOrder(order3);
        Mads.addOrder(order4);
        Mads.addOrder(order5);
        Mads.addOrder(order6);

        System.out.println(order1.getOrderPrice());
        System.out.println(Mikkel.totalBuy()); */

        Product trøje = new Product(5, "Trøje", 250);
        Product sko = new Product(10, "Sko", 500);
        Product kælk = new Product(15, "Kælk", 700);
        Product ske = new Product(17, "Ske", 50);
        Product gaffel = new Product(19, "Gaffel", 39);

        Customer Mikkel = new Customer("Mikkel", LocalDate.of(1995, 7, 16), "amount");

        Order order1 = new Order(1);
        order1.createOrderLine(5, kælk);
        order1.createOrderLine(6, sko);

        Mikkel.addOrder(order1);

        System.out.println(Mikkel.totalBuyWithDiscount());
        Discount fixedDiscount = new FixedDiscount();
        System.out.println(fixedDiscount.getDiscountPrice(order1.getOrderPrice()));
        Discount percentageDiscount = new PercentDiscount();
        System.out.println(percentageDiscount.getDiscountPrice(order1.getOrderPrice()));
    }
}
