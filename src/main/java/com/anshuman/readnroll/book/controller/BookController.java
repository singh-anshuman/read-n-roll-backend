package com.anshuman.readnroll.book.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anshuman.readnroll.book.model.Book;

@RestController
public class BookController {
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>>getBooks() {
		//	TODO: Books to be returned
		return null;
	}
}