package com.anshuman.readnroll.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anshuman.readnroll.book.dao.BookRepository;
import com.anshuman.readnroll.book.model.Book;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getBooks() {
		return bookRepository.findAll(); 
	}
	
}