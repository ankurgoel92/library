package com.spring;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.repo.BookRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LibraryApplicationTests {

	@Autowired
	private BookRepository bookRepo;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void persistenceWorks() {
		assertThat(bookRepo.findAll(), not(Matchers.emptyIterable()));
	}

}

