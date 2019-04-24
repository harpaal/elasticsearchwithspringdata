/**
 * 
 */
package com.hpst.elasticsearch.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.hpst.elasticsearch.beans.Book;

/**
 * @author harsingh14
 *
 */
public interface BookRepository extends ElasticsearchRepository<Book,String>{

	 Page<Book> findByAuthor(String author, Pageable pageable);
	 List<Book> findByTitle(String title);
}
