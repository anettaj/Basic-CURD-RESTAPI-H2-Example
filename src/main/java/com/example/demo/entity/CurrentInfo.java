package com.example.demo.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class CurrentInfo {

	@Id  
	//defining id as column name  
	@Column  
	private int id;  
	@Column  
	private int durationTo;  
	//defining name as column name
	@Column  
	private int durationFrom;  
	//defining name as column name
	@Column  
	//@JsonFormat(pattern="YYYY-MM-DD")
	private Date expiryDate;  
	//defining name as column name
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
		return "CurrentInfo [id=" + id + ", durationTo=" + durationTo + ", durationFrom=" + durationFrom
				+ ", expiryDate=" + expiryDate + "]";
	}
	public CurrentInfo(int id, int durationTo, int durationFrom, Date expiryDate) {
		super();
		this.id = id;
		this.durationTo = durationTo;
		this.durationFrom = durationFrom;
		this.expiryDate = expiryDate;
	}
	public CurrentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
