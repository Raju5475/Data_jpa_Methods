package com.raju;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.raju.entity.BookRepository;
import com.raju.it.Book;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx 
		= SpringApplication.run(Application.class, args);
		BookRepository repo = ctx.getBean(BookRepository.class);
		List<Book> books = repo.printBooks();
		for(Book b: books) {
			System.out.println(b);
		}

}}
