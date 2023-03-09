package Ordre_Discount_Opgave.minihandel;

import Ordre_Discount_Opgave.minihandel.Discount.Discount;
import Ordre_Discount_Opgave.minihandel.DiscountStrategy.FixedDiscount;
import Ordre_Discount_Opgave.minihandel.DiscountStrategy.PercentDiscount;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Models a Customer with Orders.
 */
public class Customer {
	private String name;
	private LocalDate birthday;
	private List<Order> orders = new ArrayList<Order>();
	private Discount discount;
	private String discountForm;
	private Order order;

	/**
	 * Create a new Customer.
	 * 
	 * @param name     the name.
	 * @param birthday birthday of the customer.
	 */
	public Customer(String name, LocalDate birthday, String discountForm) {
		this.name = name;
		this.birthday = birthday;
		this.discountForm = discountForm;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return this.birthday;
	}

	public List<Order> getOrders() {
		return new ArrayList<Order>(orders);
	}

	public void addOrder(Order order) {
		if (!orders.contains(order)) {
			orders.add(order);
		}
	}

	public void removeOrder(Order order) {
		if (orders.contains(order)) {
			orders.remove(order);
		}
	}

	public double totalBuy(){
		double total = 0;
		for(Order order : orders){
			total += order.getOrderPrice();
		}
		return total;
	}
	public double totalBuyWithDiscount(){
		double total = 0;
		double totalWithDiscount = 0;
		if(discountForm.equalsIgnoreCase("percentage")){
			Ordre_Discount_Opgave.minihandel.DiscountStrategy.Discount discount1 = new PercentDiscount();
			for (Order order : orders) {
				total += order.getOrderPrice();
			}
			discount1.getDiscountPrice(total);
		}

		if(!discountForm.equalsIgnoreCase("percentage")){
			for(Order order : orders){
				total += order.getOrderPrice();
				if(total > 1000){
					Ordre_Discount_Opgave.minihandel.DiscountStrategy.Discount discount2 = new FixedDiscount();
					totalWithDiscount = discount2.getDiscountPrice(order.getOrderPrice());
				}
			}
		}
		System.out.print("Order price before discount: " + total + " Ordre price with discount: ");
		return totalWithDiscount;
	}
}
