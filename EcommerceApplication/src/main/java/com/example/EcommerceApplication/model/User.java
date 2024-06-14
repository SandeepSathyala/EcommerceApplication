package com.example.EcommerceApplication.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
//@Document(collection = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int user_id;
	
	@Column
	 private String username;
	@Column
     private String password;
	@Column
	 private String email;
	@Column
	 private String first_name;
	@Column
	 private String last_name;
	@Column
	 private long phone;
	@Column
	 private String address;
	
	@CreatedDate
	 private LocalDateTime createdAt;

	@LastModifiedDate
	 private LocalDateTime updatedAt;
	
	 private Role role;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public User(int user_id, String username, String password, String email, String first_name, String last_name,
			long phone, String address, LocalDateTime createdAt, LocalDateTime updatedAt, Role role) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone = phone;
		this.address = address;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.role = role;
	}

}
