package com.BMS.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BMS.Entity.Books;

@Repository
public interface BookRepository extends JpaRepository<Books, Integer> {

}
