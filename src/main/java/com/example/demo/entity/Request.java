package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "REQUEST")
public class Request {

	@Id  
	//defining id as column name  
	@Column
	
	
	
	
	
	private int id;  
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private User user;
	
	public void User(User user) {
		
	}
	
	
	
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}





	//defining name as column name  
	@Column  
	private String status;  
	//defining Type as column name 
	@Column  
	//@JsonFormat(pattern="yyyy-MM-dd")
	private Date dateFrom;  
	//defining name as column name
	@Column  
	private Date dateTo;  
	//defining name as column name
	@Column  
	private int durationTo;  
	//defining name as column name
	@Column  
	private int durationFrom;  
	//defining name as column name
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
		return dateTo;
	}
	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
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
	public Request(int id, String status, Date dateFrom, Date dateTo, int durationTo, int durationFrom) {
		super();
		this.id = id;
		this.status = status;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.durationTo = durationTo;
		this.durationFrom = durationFrom;
	}
	public Request() {
		super();
	}
	
	

}
