package com.nimap.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
public class Category {
 @Id
 private  int cid; // acting as the fc 
private String cname;
private String level;
@OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
@JoinColumn(name="cat_id",referencedColumnName ="cid" )
private List<Product> products;

 public Category(int cid, String cname, String level) {
	
	this.cid = cid;
	this.cname = cname;
	this.level = level;
}
public Category() {
	 super();
 }


	public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getLevel() {
	return level;
}
public void setLevel(String level) {
	this.level = level;
}
public List<Product> getProducts() {
	return products;
}
public void setProducts(List<Product> products) {
	this.products = products;
}
// TODO Auto-generated constructor stub
@Override
public String toString() {
	return "Category [cid=" + cid + ", cname=" + cname + ", level=" + level + ", products=" + products + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

	






}
