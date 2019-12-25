package com.suraj.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "laptop")
public class Laptop {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "laptopname",length=20)
	private String laptopname;

	public Laptop() {
		super();
	}

	public Laptop(int id, String laptopname) {
		super();
		this.id = id;
		this.laptopname = laptopname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLaptopname() {
		return laptopname;
	}

	public void setLaptopname(String laptopname) {
		this.laptopname = laptopname;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", laptopname=" + laptopname + "]";
	}
	
	
}
