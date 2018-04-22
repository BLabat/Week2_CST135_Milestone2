
abstract public class Product {
	
	private String name;
	private String brand;
	private double price;
	
	public Product() {}
	
	public Product(String name, String brand, double price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	public String getName() {
		return this.name;
	}
	public String getBrand() {
		return this.brand;
	}
	public double getPrice() {
		return this.price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String toString() {
		return "\n"
		+ getName()
		+"\nPrice; " + getPrice()
		+"\nBrand: " + getBrand();
		
	}
}
