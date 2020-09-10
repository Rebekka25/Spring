package de.example.library.service;

import java.util.List;

import org.springframework.stereotype.Service;

import de.example.library.entity.Book;
import de.example.library.entity.User;

@Service
public interface BookService {

	/**
	 * Gibt eine Liste von Büchern zurück.
	 * @return
	 */
	List<Book> getBooks();
	
	/**
	 * Gibt ein Buch unter der Angabe der Isbn wieder.
	 * @param isbn
	 * @return
	 */
	Book getBookWithIsbn(String isbn);
	/**
	 * 
	 * @param book
	 * @param user
	 * @return
	 */
	boolean borrow(Book book,User user);
}
