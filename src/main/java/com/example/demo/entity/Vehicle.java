package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Vehicle {
	@Id  
	//defining id as column name  
	@Column  
	private int id;  
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private User post;
	
	
	
	
	
	
	//defining name as column name  
	
	
	
	
	
	
	
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
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
		return "Vehicle [id=" + id + ", type=" + type + ", modal=" + modal + ", colour=" + colour + ", registerationNo="
				+ registerationNo + "]";
	}
	public Vehicle(int id, String type, String modal, String colour, int registerationNo) {
		super();
		this.id = id;
		this.type = type;
		this.modal = modal;
		this.colour = colour;
		this.registerationNo = registerationNo;
	}
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
