package com.anshuman.readnroll.book.service;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anshuman.readnroll.book.dao.BookRepository;
import com.anshuman.readnroll.book.model.Book;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getBooks(String searchString) {
		return bookRepository.findAll().stream()
				.filter(book -> StringUtils.containsIgnoreCase(book.getTitle(), searchString))
				.collect(Collectors.toList());
	}
	
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}
	
}