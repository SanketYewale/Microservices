package com.contact.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Contact {

	private int cId;
	private String email;
	private String contactName;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id")
	private int userId;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Contact [cId=" + cId + ", email=" + email + ", contactName=" + contactName + ", userId=" + userId + "]";
	}
	
	
}
