package com.hpst.elasticsearch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.hpst.elasticsearch.beans.Book;
import com.hpst.elasticsearch.service.BookService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ElasticsearchwithspringdataApplicationTests {

 @Autowired
 BookService bookService;
 
 @Autowired
 ElasticsearchTemplate elasticSearchTemplate;
 

 @Before
 public void createIndex() {
	 elasticSearchTemplate.createIndex(Book.class);
	 	
 }

 @Test
 public void testUpdateDocument() {
     Book book = new Book("1001", "Elasticsearch Basics", "Harpal Singh", "24-APRIL-2019");
	 Book testBook = bookService.save(book);
	  assertNotNull(testBook.getId());
      assertEquals(testBook.getTitle(), book.getTitle());
      assertEquals(testBook.getAuthor(), book.getAuthor());
      assertEquals(testBook.getReleaseDate(), book.getReleaseDate());
 }
}

