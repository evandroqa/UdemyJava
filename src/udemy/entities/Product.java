package udemy.entities;

public class Product {
	
	private String name;
	private Double price;
	
	public Product() {
	}

	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
	
	public Product(Double price) {
		this.price = price;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public static void staticProductConsumerPrice(Product p) {
		p.setPrice(p.getPrice() * 1.1);
	}

	public void nonstaticProductConsumerPrice() {
		setPrice(getPrice() * 1.1);
	}
	
	
	public static boolean staticProductPredicate(Product p) {
		return p.getPrice() >= 100.0;
	}

	public boolean nonStaticProductPredicate() {
		return price >= 100.0;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + String.format("%.2f", price) + "]";
	}
	
}
