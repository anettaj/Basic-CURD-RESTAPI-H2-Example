package com.example.demo.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity

public class Request {

	@Id  
	//defining id as column name  
	 
	@Column  
	private String status;  
	//defining status as column name 
	@Column  
	//@JsonFormat(pattern="yyyy-MM-dd")
	private Date dateFrom;  
	//defining name as column name
	@Column  
	private Date Date_To;  
	//defining name as column name
	@Column  
	private int durationTo;  
	//defining name as column name
	@Column  
	private int durationFrom;  
	//defining name as column name

	@ManyToOne()
	@JoinColumn(name="user_id")
	private Request user_id;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}
	public Date getDateTo() {
		return Date_To;
	}
	public void setDate_To(Date dateTo) {
		this.Date_To = dateTo;
	}
	public int getDurationTo() {
		return durationTo;
	}
	public void setDurationTo(int durationTo) {
		this.durationTo = durationTo;
	}
	public int getDurationFrom() {
		return durationFrom;
	}
	public void setDurationFrom(int durationFrom) {
		this.durationFrom = durationFrom;
	}
	public Request(String status, Date dateFrom, Date dateTo, int durationTo, int durationFrom) {
		super();
		this.status = status;
		this.dateFrom = dateFrom;
		this.Date_To = dateTo;
		this.durationTo = durationTo;
		this.durationFrom = durationFrom;
	}
	public Request() {
		super();
	}
	
	

}