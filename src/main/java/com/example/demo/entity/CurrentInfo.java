package com.example.demo.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity

public class CurrentInfo {

	@Id  
	//defining id as column name   
	 
	
	@Column  
	//@JsonFormat(pattern="YYYY-MM-DD")
	private Date expiryDate;  
	//defining name as column name
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user_id;
	@OneToOne
	@JoinColumn(name="Duration_To")
	private Request Duration_To;
	@OneToOne
	@JoinColumn(name="Duration_From")
	private Request Duration_From;
	
	@OneToOne
	@JoinColumn(name="Date_To")
	private Request Date_To;
	
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
		return "CurrentInfo [ expiryDate=" + expiryDate + "]";
	}
	public CurrentInfo(Date expiryDate) {
		super();
		this.expiryDate = expiryDate;
	}
	public CurrentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}