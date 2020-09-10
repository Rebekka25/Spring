package de.example.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import de.example.library.entity.Book;
import de.example.library.entity.User;
import de.example.library.repository.BookRepository;

@Component
public class BookServiceImpl implements BookService {
	@Autowired
	BookRepository bookRepository;

	public List<Book> getBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	public Book getBookWithIsbn(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean borrow(Book book, User user) {
		// TODO Auto-generated method stub
		return false;
	}

	

	
}
