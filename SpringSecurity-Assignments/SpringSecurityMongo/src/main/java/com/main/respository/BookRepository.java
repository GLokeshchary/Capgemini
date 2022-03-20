package com.main.respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.main.models.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, String>{

}
