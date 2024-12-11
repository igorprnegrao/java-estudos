package entities;

public class Comment {
	String text;

	
	//construtor vazio
	public Comment() {
	}
	// construtor parâmentros(sobrecarga)

	public Comment(String text) {
		this.text = text;
	}
	
	//getters and setters

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
}
