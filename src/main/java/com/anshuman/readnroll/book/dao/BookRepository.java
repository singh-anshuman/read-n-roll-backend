package com.anshuman.readnroll.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anshuman.readnroll.book.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{
	
}