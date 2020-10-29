package com.Nathalie.show.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Nathalie.show.models.Book;
import com.Nathalie.show.services.BookService;

@RestController
public class BooksApi{
	private final BookService bookService;
	public BooksApi(BookService bookService) {
		this.bookService = bookService;
	}
	@RequestMapping("/api/books")
	public String index() {
		return bookService.getAllBooks().toString(); //added toString because allBooks returns List obj
	}
	
	@RequestMapping(value="/api/books", method=RequestMethod.POST)
	public Book create (@RequestParam(value="title") String title, @RequestParam(value="description") String description, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numberOfPages) {
		Book book = newBook(title, description, lang, numberOfPages);
		return bookService.createBook(book);
	}
	
	private Book newBook(String title, String description, String lang, Integer numberOfPages) {
		// TODO Auto-generated method stub
		return null;
	}
	@RequestMapping("/api/books/{id}")
	public Book show(@PathVariable("id") Long id) {
		Book book = ((BookService) bookService).findBook(id);
		return book;
	}
}

