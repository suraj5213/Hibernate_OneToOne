package com.suraj.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	
	@Id
	@Column(name = "rollno")
	private int rollno;
	
	@Column(name = "firstname",length=20)
	private String firstname;
	
	@Column(name = "lastname",length=20)
	private String lastname;
	
	@OneToOne
	private Laptop laptop;

	public Student() {
		super();
	}

	public Student(int rollno, String firstname, String lastname, Laptop laptop) {
		super();
		this.rollno = rollno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.laptop = laptop;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", firstname=" + firstname + ", lastname=" + lastname + ", laptop="
				+ laptop + "]";
	}

	
}
