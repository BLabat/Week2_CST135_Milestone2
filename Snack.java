
abstract class Snack extends Product {
	
	public Snack() {
		super.setName("Sun Chips");
		super.setBrand("Frito-lay");
		super.setPrice(1.25);
	}
	public Snack(String name, String brand, double price) {
		super.setName(name);
		super.setBrand(brand);
		super.setPrice(price);
	}
	public Snack(Snack copySnack) {
		super.setName(copySnack.getName());
		super.setBrand(copySnack.getBrand());
		super.setPrice(copySnack.getPrice());
	}
	
	public String toString() {
		return super.toString();
	}

}
