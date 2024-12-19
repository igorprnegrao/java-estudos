package model.entities;


public class Rectangle extends AbstractShape{
	
	private Double width;
	private Double height;
	
	
	public Rectangle(model.enums.Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}


	public Double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public Double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	@Override
	public double area() {
		return width * height;
	}
	
	
	
}
