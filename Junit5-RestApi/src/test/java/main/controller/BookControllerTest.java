package main.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.data.mongo.AutoConfigureDataMongo;
//import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


import main.models.Books;

import main.service.BooksService;

@TestMethodOrder(OrderAnnotation.class)
@ComponentScan(basePackages = "main")
@AutoConfigureMockMvc
@ContextConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest
class BookControllerTest {
	@Autowired
	MockMvc mockMvc;
	@MockBean
	@Autowired
	BooksService booksService;
	@InjectMocks
	BookController bookController;
	
	List<Books> books;
	Books books2;
	@BeforeEach
	public void setup()
	{
		mockMvc=MockMvcBuilders.standaloneSetup(bookController).build();
	}

	@Test
	@Order(1)
	public void testgetallbooks() throws Exception {
		books= new ArrayList<Books>();
		books.add(new Books("100", "bheemlanayak", "sagakchandra", 4));
		books.add(new Books("101", "Radheshayam", "PB", 3));
		books.add(new Books("103", "sebatian", "abbavaram", 2));
		when(booksService.getallbooks()).thenReturn(books);
		//assertEquals(3, booksService.getallbooks().size());
		
		 try { 
			 this.mockMvc.perform(get("/books")) 
			             .andExpect(status().isFound())
		                 .andDo(print()); 
			 } 
		 catch (Exception e) 
		 { // TODO Auto-generated catch block
		  e.printStackTrace();
		  }
		 
	}

}