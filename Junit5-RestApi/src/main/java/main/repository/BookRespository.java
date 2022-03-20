package main.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import main.models.Books;

public interface BookRespository extends MongoRepository<Books, String> {

}
