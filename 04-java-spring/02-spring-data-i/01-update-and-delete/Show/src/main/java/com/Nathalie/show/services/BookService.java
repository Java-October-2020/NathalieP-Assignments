package com.Nathalie.show.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Nathalie.show.models.Book;
import com.Nathalie.show.repositories.BookRepository;

@Service
public class BookService {
	private BookRepository bRepo;
	public BookService(BookRepository repo) {
		this.bRepo = repo;
	}
	//get all
	public List<Book> getAllBooks(){
		return this.bRepo.findAll();
	}
	//get one
	public Book getOneBook(Long id) {
		return this.bRepo.findById(id).orElse(null);
	}
	//create book
	public Book createBook(Book newBook) {
		return this.bRepo.save(newBook);
	}
	//update book
	public Book updateBook(Book updatedBook) {
		return this.bRepo.save(updatedBook);
	}
	//delete book
	public String deleteBook(Long id) {
		this.bRepo.deleteById(id);
		return "Book" + id + "has been deleted";
	}
	public Book findBook(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
