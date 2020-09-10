package de.example.library.entity;
//import java.util.date; nicht nehmen ist veraltet
//seit Java8 gibt es LocalDate
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String author;
	private String isbn;
	private LocalDate publishingYear;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public LocalDate getPublishingYear() {
		return publishingYear;
	}
	public void setPublishingYear(LocalDate publishingYear) {
		this.publishingYear = publishingYear;
	}
	
}
