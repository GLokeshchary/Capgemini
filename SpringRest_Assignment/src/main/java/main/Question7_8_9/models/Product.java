package main.Question7_8_9.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
	@Id
	int productid;
	String productname;
	float cost;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int productid, String productname, float cost) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.cost = cost;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	
	

}
