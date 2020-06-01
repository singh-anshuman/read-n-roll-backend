package com.anshuman.readnroll.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anshuman.readnroll.book.model.Book;
import com.anshuman.readnroll.book.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>>getBooks() {
		return new ResponseEntity<>(bookService.getBooks(),HttpStatus.OK);
	}
}