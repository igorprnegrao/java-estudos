package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>();
	
	//construtor default
	public Post(){
	}	
	
	
	//construtor com atributos(sobrecarga)
	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
		//não colocar a lista no construtor
	}

	//getters and setters

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}
	
	//OBS: QUANDO SE USA COLLECTIONS, EVITAR USAR O MÉTODO GET
	//USAR NO LUGAR O ADD E  REMOVE
	//método add comment
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	//método remove comment
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}

	//usando o método stringBuider 
	@Override
	public String toString() {
		//estanciando a classe stringBuider
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		for (Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();
	}
	
	
	
}

