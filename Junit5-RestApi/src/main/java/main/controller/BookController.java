package main.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import main.models.Books;
import main.service.BooksService;

@RestController
public class BookController {
	@Autowired
	BooksService booksService;
	@GetMapping("/books")
	public List<Books> getallbooks()
	{
		return booksService.getallbooks();
	}
	@PostMapping("/books")
	public void addbooks(@RequestBody Books books)
	{
		booksService.AddBooks(books);
	}
	@GetMapping("/books/{bookid}")
	public Optional<Books> getabooks(@PathVariable String bookid)
	{
		return booksService.getabooks(bookid);
	}
	@PutMapping("/books/{bookid}")
	public void updatebooks(@RequestBody Books books,@PathVariable String bookid) 
	{
		booksService.updatebooks(bookid, books);
	}
	@DeleteMapping("/books/{bookid}")
	public void deletebooks(@PathVariable String bookid)
	{
		booksService.deletebooks(bookid);
	}
	
}
