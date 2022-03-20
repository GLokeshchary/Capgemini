package main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import main.models.Books;
import main.repository.BookRespository;

@Service
public class BooksService {
	@Autowired
	BookRespository bookRespository;
	
	public List<Books> getallbooks()
	{
		 return bookRespository.findAll();
	}
	public void AddBooks(Books books) 
	{
		 bookRespository.save(books);
	}
	public Optional<Books> getabooks(String bookid)
	{
		return bookRespository.findById(bookid);
	}
	public void updatebooks(String bookid,Books books)
	{
		bookRespository.save(books);
		
	}
	public void deletebooks(String bookid) {
		bookRespository.deleteById(bookid);
		
	}
}
