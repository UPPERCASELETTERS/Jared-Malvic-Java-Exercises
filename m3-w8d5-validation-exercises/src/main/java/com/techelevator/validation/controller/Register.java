package com.techelevator.validation.controller;

import java.util.Date;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class Register {
	
	@NotBlank (message="First name is required") @Size (max=20, message="First name must be between 1 and 20 characters")
	private String firstName;
	
	@NotBlank (message="First name is required") @Size (max=20, message="Last name must be between 1 and 20 characters")
	private String lastName;
	
	@NotBlank (message="Email is required") @Email (message="Please enter a valid email")
	private String email;
	
	@NotBlank (message="First name is required") @Size (min=8, message="Password name must be atleast 8 characters")
	private String password;
	
	@Pattern(regexp="^\\d{4}\\-\\d{2}\\-\\d{2}$", message="Please follow YYYY-MM-DD pattern")
	private String date;
	
	@Min(1) @Max(10)
	private Integer tickets;
	
	private String emailConfirm;
	private String passwordConfirm;
	
	
	public String getEmailConfirm() {
		return emailConfirm;
	}
	public void setEmailConfirm(String emailConfirm) {
		this.emailConfirm = emailConfirm;
	}
	public String getPasswordConfirm() {
		return passwordConfirm;
	}
	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getTickets() {
		return tickets;
	}
	public void setTickets(Integer tickets) {
		this.tickets = tickets;
	}
	

}
