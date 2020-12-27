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
	@JoinColumn(name="Expiry_Date")
	private Request Date_To;
	
	public CurrentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}