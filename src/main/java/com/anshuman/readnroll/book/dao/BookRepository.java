package com.anshuman.readnroll.book.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anshuman.readnroll.book.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
	
}