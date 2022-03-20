package com.main.Controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.models.Book;
import com.main.respository.BookRepository;

@RestController
public class BooksController {
	
	@Autowired
	BookRepository bookRepository;
	
	@GetMapping("/books")
	public List<Book> getallbooks()
	{
		return bookRepository.findAll();
	}
	@PostMapping("/books")
	public void addabook(@RequestBody Book book)
	{
		bookRepository.save(book);
	}
	@GetMapping("/books/{bookid}")
	public Book getbook(@PathVariable String bookid)
	{
		 Optional<Book> book = bookRepository.findById(bookid);
		 return book.get();
	}

}
