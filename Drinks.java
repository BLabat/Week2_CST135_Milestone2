
public class Drinks extends Product {
	public Drinks() {
	super.setName("Dr. Pepper");
	super.setBrand("Coka-Cola");
	super.setPrice(.75);
	}
	public Drinks(String name, String brand, double price) {
		super.setName(name);
		super.setBrand(brand);
		super.setPrice(price);
	}
	public Drinks(Drinks copyDrinks) {
		super.setName(copyDrinks.getName());
		super.setBrand(copyDrinks.getBrand());
		super.setPrice(copyDrinks.getPrice());
	}
	public String toString() {
		return "Drink [" +super.getName() + "Brand: " + getBrand()
		+ "Price: " + getPrice();
	}
}
