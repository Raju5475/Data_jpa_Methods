package com.raju.entity;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.raju.it.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
	
	
	@Query(value="Select * from book",nativeQuery=true)
	public List<Book> printBooks();
}
