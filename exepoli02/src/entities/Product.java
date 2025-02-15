package entities;

public class Product {
	
	private String name;
	private Double price;
	
	//construtor default 
	public Product() {
	}
	
	//construtor com argumentos
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	//getters and setters
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
	
	//métodos
	public String priceTag() {
		return name + " $ " + String.format("%.2f", price);
	}
	
	
}
