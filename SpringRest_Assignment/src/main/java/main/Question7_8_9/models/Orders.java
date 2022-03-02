package main.Question7_8_9.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Orders {
	@Id
	int orderid;
	float totalbill;
	public Orders() {
		// TODO Auto-generated constructor stub
	}
	
	public Orders(int orderid, float totalbill) {
		super();
		this.orderid = orderid;
		this.totalbill = totalbill;
	}

	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public double getTotalbill() {
		return totalbill;
	}
	public void setTotalbill(float totalbill) {
		this.totalbill = totalbill;
	}
	

}
