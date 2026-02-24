package com.klu.s29restapi_db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klu.s29restapi_db.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
