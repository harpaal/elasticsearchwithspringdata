package com.hpst.elasticsearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import com.hpst.elasticsearch.service.BookService;

@SpringBootApplication
@EnableElasticsearchRepositories
public class Application {
	
	@Autowired
    private ElasticsearchOperations es;

    @Autowired
    private BookService bookService;

	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
