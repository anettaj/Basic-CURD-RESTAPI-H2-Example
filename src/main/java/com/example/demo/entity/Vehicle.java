package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {
	@Id  
	@Column  
	private String type;  
	//defining Type as column name  
	@Column  
	private String modal;  
	//defining Modal as column name 
	@Column  
	private String colour; 
	//defining Colour as column name
	@Column  
	private int registerationNo; 
	//defining Registeration_no as column name
	

	@ManyToOne()
	@JoinColumn(name="user_id")
	private Vehicle user_id;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModal() {
		return modal;
	}
	public void setModal(String modal) {
		this.modal = modal;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getRegisterationNo() {
		return registerationNo;
	}
	public void setRegisterationNo(int registerationNo) {
		this.registerationNo = registerationNo;
	}
	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", modal=" + modal + ", colour=" + colour + ", registerationNo="
				+ registerationNo + "]";
	}
	public Vehicle(String type, String modal, String colour, int registerationNo) {
		super();
		this.type = type;
		this.modal = modal;
		this.colour = colour;
		this.registerationNo = registerationNo;
	}
	public Vehicle() {
		super();
	}
	
	

}
