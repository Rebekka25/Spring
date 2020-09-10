package de.example.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import de.example.library.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
