package de.example.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.example.library.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
