package com.hpst.elasticsearch.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.hpst.elasticsearch.beans.Book;

/**
 * @author harsingh14
 *
 */
public interface BookService {

    Book save(Book book);

    void delete(Book book);

    Optional<Book> findOne(String id);

    Iterable<Book> findAll();

    Page<Book> findByAuthor(String author, PageRequest pageRequest);

    List<Book> findByTitle(String title);

}