package com.capg.entity;
import jakarta.persistence.Table; 
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
@Entity
@Table(name="customer500")
public class Customer {
	
	@Id
	private int id;
	
	// @Column(name="")
	private String name;
	private String mobileNo;
	private int age;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String name, String mobileNo, int age) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNo = mobileNo;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
