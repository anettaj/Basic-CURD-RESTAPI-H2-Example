package com.example.demo.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.sun.istack.NotNull;

@Entity
@Table(name = "USER")//initialising as foreign key
public class User {

	@Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY)//auto generating
	@NotNull
	@Column(unique = true)
	
	private int id;
	
	//defining id as column name
	
	
	
	
	
	
	
	
	//defining name as column name  
	@Column  
	private String name;  
	//defining name as column name  
	@Column  
	private String gender;  
	//defining gender as column name  
	@Column  
	private String user;  
	//defining gender as column name
	@Column  
	private int adharNo;  
	//defining gender as column name
	@Column
	//@JsonFormat(pattern="yyyy-MM-dd")
	private Date dob;  
	//defining gender as column name
	@Column  
	private String address;  
	//defining gender as column name
	@Column
	private int lnNo;  
	//defining gender as column name
	@Column
	private int mobileNo;  
	//defining gender as column name
	@Column
	private int noOfPass;  
	//defining gender as column name
	@Column
	private int noOfVehicle;  
	//defining gender as column name
	
	
	
	//who all are taking id as a foreign key is initialised in parent class
	@OneToMany(mappedBy = "user")
	private Request request;
	
	@OneToMany(mappedBy = "user")
	private CurrentInfo currentinfo;
	
	@OneToMany(mappedBy = "user")
	private Vehicle vehicle;
	
	
	
	
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public int getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(int adharNo) {
		this.adharNo = adharNo;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getLnNo() {
		return lnNo;
	}
	public void setLnNo(int lnNo) {
		this.lnNo = lnNo;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public int getNoOfPass() {
		return noOfPass;
	}
	public void setNoOfPass(int noOfPass) {
		this.noOfPass = noOfPass;
	}
	public int getNoOfVehicle() {
		return noOfVehicle;
	}
	public void setNoOfVehicle(int noOfVehicle) {
		this.noOfVehicle = noOfVehicle;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", gender=" + gender + ", user=" + user + ", adharNo=" + adharNo
				+ ", dob=" + dob + ", address=" + address + ", lnNo=" + lnNo + ", mobileNo=" + mobileNo + ", noOfPass="
				+ noOfPass + ", noOfVehicle=" + noOfVehicle + "]";
	}
	public User(int id, String name, String gender, String user, int adharNo, Date dob, String address, int lnNo,
			int mobileNo, int noOfPass, int noOfVehicle) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.user = user;
		this.adharNo = adharNo;
		this.dob = dob;
		this.address = address;
		this.lnNo = lnNo;
		this.mobileNo = mobileNo;
		this.noOfPass = noOfPass;
		this.noOfVehicle = noOfVehicle;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
