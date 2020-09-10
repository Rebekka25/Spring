package de.example.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import de.example.library.entity.Book;
import de.example.library.repository.BookRepository;

@RestController
public class BookController {
	@Autowired
	BookRepository bookRepository;
	@GetMapping("/books")
	public List<Book> getBooks(){
		Book book = new Book();
		return null;
	}
}
