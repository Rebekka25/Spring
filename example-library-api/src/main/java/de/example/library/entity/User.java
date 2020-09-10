package de.example.library.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue
	private Long id;
	private String lastname;
	private String firstname;
	private LocalDate dateOfBirth;
	private LocalDate entryDate;
	private float fee;
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public LocalDate getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(LocalDate entryDate) {
		this.entryDate = entryDate;
	}
	public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	public User(String lastname, String firstname, LocalDate dateOfBirth, LocalDate entryDate, float fee) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		this.dateOfBirth = dateOfBirth;
		this.entryDate = entryDate;
		this.fee = fee;
	}
	

}
