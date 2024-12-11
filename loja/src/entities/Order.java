package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date momment;
	private OrderStatus status;
	private Client client;
	
	private List<OrderItem> items = new ArrayList<>();
	
	//construtor default
	public Order() {
		
	}
	
	//Construtor parâmetros
	
	public Order(Date momment, OrderStatus status, Client client) {
		this.momment = momment;
		this.status = status;
		this.client = client;
	}
	//getters and setters

	public Date getMomment() {
		return momment;
	}

	public void setMomment(Date momment) {
		this.momment = momment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}


	
	//Método para a collections
	// parametro dentro do operador diamante como tipo e variavel do nome da list no singular
	public void addItem(OrderItem item) {
		// nome da lista. metodo add passando o parametro item 
		items.add(item);
	}
	

	public void removeItem(OrderItem item) {
		// nome da lista. metodo remove passando o parametro item 
		items.remove(item);
		
	}
	// para fazer a soma do itens da lista de items da classe OrderItem
	//devemos fazer um for implementando a soma do metodo subTotal() da classe orderItem
	public Double total() {
		double sum = 0.0;
		for (OrderItem it : items) {
			sum += it.subTotal();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order Moment: ");
		sb.append(sdf.format(momment) + "\n");
		sb.append("Order Status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client+ "\n");
		sb.append("Order Items: \n");
		for (OrderItem item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $ ");
		sb.append(String.format("%.2f ", total()));
		return sb.toString();
		}
		
}
