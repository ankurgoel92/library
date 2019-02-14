package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.spring.domain.Book;
import com.spring.repo.BookRepository;

@SpringBootApplication
public class LibraryApplication {

	@Autowired
	private BookRepository bookRepo;

	@Component
	class DataSetup implements ApplicationRunner {

		@Override
		public void run(ApplicationArguments args) throws Exception {
			bookRepo.save(Book.builder().title("Title 1").isbn("12345").build());
			bookRepo.save(Book.builder().title("Title 2").isbn("45678").build());
		}

	}

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

}
