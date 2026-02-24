package com.klu.s29restapi_db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.s29restapi_db.entity.Book;
import com.klu.s29restapi_db.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	public String saveBook(Book book)
	{
		bookRepository.save(book);
		return "Book Saved";
	}
	
	public Book getBookById(int id)
	{
		return bookRepository.findById(id).orElse(null);
	}
	
	public List<Book> getAllBooks()
	{
		return bookRepository.findAll();
	}
	
	//update book details
	public String updateBook(int id, Book newBookDetails)
	{
		Book existingBook = bookRepository.findById(id).orElse(null);
		existingBook.setBookName(newBookDetails.getBookName());
		bookRepository.save(existingBook);
		return "Book Updated";
	}
	
	public String deleteBook(int id)
	{
		bookRepository.deleteById(id);
		return "Book Deleted";
	}

}