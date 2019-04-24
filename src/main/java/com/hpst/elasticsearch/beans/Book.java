/**
 * 
 */
package com.hpst.elasticsearch.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author harsingh14
 *
 */
@Data
@Document(indexName="harpal", type="books")
@AllArgsConstructor
public class Book {
	@Id
    private String id;
    private String title;
    private String author;
    private String releaseDate;

}
