package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class OrderEnums {

	private Integer id;
	private Date data;
	private OrderStatus status;
	
	public OrderEnums() {
		
	}

	public OrderEnums(Integer id, Date data, OrderStatus status) {
		this.id = id;
		this.data = data;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "OrderEnums [id=" + id + ", data=" + data + ", status=" + status + "]";
	}
	
	
}
