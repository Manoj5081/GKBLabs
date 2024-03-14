package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="user_info")
public class UserInfo 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int id;
	@Column(name="user_name")
	private String userName;
	@Column(name="email")
	private String email;
	@Column(name="age")
	private int age;
	@Column(name="dob")
	private String dob;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", userName=" + userName + ", email=" + email + ", age=" + age + ", dob=" + dob
				+ "]";
	}
	public UserInfo(int id, String userName, String email, int age, String dob) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.age = age;
		this.dob = dob;
	}
	public UserInfo() {
		
	}
	

}
