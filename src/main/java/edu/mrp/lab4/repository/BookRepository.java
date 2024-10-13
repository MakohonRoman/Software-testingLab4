package edu.mrp.lab4.repository;/*
@author   Makohon Roman
@project   Basic HTTP requests. CRUD
@class  $444A
@version  1.0.0
@since 4.10.2024 - 14.23
*/

import edu.mrp.lab4.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {
}
