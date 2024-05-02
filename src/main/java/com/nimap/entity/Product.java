package com.nimap.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Product {
@Id
private int pid;
private String pname;
public Product(int pid, String pname) {

	this.pid = pid;
	this.pname = pname;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}


public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}


}
