package com.Nathalie.show.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Nathalie.show.models.Book;
import com.Nathalie.show.services.BookService;

@RestController
public class BookController {
	private BookService bService;
	
	public BookController(BookService service) {
		this.bService = service;
	}
	
	//EndPoints
	
	@GetMapping("/")
	public List<Book> index(){
		return this.bService.getAllBooks();
	}
	@GetMapping("{id}")
	public Book getBook (@PathVariable("id") Long id) {
		return this.bService.getOneBook(id);
	}
	@PutMapping("/book/update/{id}")
	public Book edit(@PathVariable("id") Long id, Book updatedBook) {
		return this.bService.updateBook(updatedBook);
	}
	@PostMapping("/")
	public Book create(Book newBook) {
		return this.bService.createBook(newBook);
	}
	@DeleteMapping("/book/delete/{id}")
	public void removeBook(@PathVariable("id") Long id) {
		this.bService.deleteBook(id);
	}
}
